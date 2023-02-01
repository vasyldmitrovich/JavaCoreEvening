package com.prostopizza.service.productService;

import com.prostopizza.repository.IngredientRepository;
import com.prostopizza.repository.ProductIngredientRepository;
import com.prostopizza.repository.ProductRepository;
import com.prostopizza.model.Ingredients;
import com.prostopizza.model.Products;
import com.prostopizza.model.ProductsIngredient;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("productServices")
@Transactional
public class ProductServices {

    private SessionFactory sessionFactory;
    final
    ProductRepository productRepo;
    final
    ProductIngredientRepository productIngredientRepository;
    final
    IngredientRepository ingredientRepository;


    public ProductServices(ProductRepository productRepo, ProductIngredientRepository productIngredientRepository, IngredientRepository ingredientRepository) {
        this.productRepo = productRepo;
        this.productIngredientRepository = productIngredientRepository;
        this.ingredientRepository = ingredientRepository;
    }

    /**
     * Retrieves all persons
     * @return a list of products
     */
    public List<Products>getAllProducts(){
        return productRepo.findAll();
    }
    public List<Products>getProductsByIngredientId(Long ingredient_id){
        List<Long> products_ids;
        products_ids=productIngredientRepository.getProductsByIngredient(ingredient_id);
        return productRepo.getProductsByIds(products_ids);
    }
    public List<Ingredients>getIngredientByProductId(Long product_id){
        List<Long> product_ingredient_ids;
        product_ingredient_ids=productIngredientRepository.getIngredientsByProduct(product_id);
        return ingredientRepository.getIngredientByIds(product_ingredient_ids);
    }

    public List<ProductsIngredient> getAllIngredients(){
        return ingredientRepository.getAllIngredientsWithProductId();
    }

    public Products getProductsById(long productId) throws Exception {
        return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
    }
}
