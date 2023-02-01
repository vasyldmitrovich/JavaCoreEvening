package com.prostopizza.repository;

import com.prostopizza.model.ProductIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductIngredientRepository extends JpaRepository<ProductIngredient,Long> {

    @Query(nativeQuery=true,value="select ProductIngredient.product_id from ProductIngredient where ProductIngredient.ingredient_id=:ingredient_id")
    List<Long> getProductsByIngredient(@Param("ingredient_id") Long ingredient_id);
    @Query(nativeQuery=true,value="select product_ingredient.ingredient_id from product_ingredient where product_ingredient.product_id=:product_id")
    List<Long> getIngredientsByProduct(@Param("product_id") Long product_id);
}
