package com.prostopizza.repository;

import com.prostopizza.model.Ingredients;
import com.prostopizza.model.ProductsIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredients,Long> {

    @Query(nativeQuery=true,value="select ing.id, name from ingredients ing where ing.id IN (:ingredients_ids)")
    List<Ingredients> getIngredientByIds(@Param("ingredients_ids") List<Long> ingredients_ids);

    @Query(value="Select product_ingredient.id as productsIngredientId,product_ingredient.product_id as product_Id,product_ingredient.ingredient_id as ingredient_Id, ingredients.name as ingredient_Name From ProductIngredient product_ingredient, Ingredients ingredients  where product_ingredient.ingredient_id=ingredients.id")
    List<ProductsIngredient> getAllIngredientsWithProductId();
}
