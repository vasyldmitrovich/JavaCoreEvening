package com.prostopizza.repository;

import com.prostopizza.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
    @Query("Select pro FROM Products  pro WHERE pro.id=:product_id")
    List<Products> getByCategoryId(@Param("product_id")String product_id);

    @Query(value="select pro from Products pro where pro.id IN (:products_ids)")
    List<Products> getProductsByIds(@Param("products_ids") List<Long> products_ids);

}
