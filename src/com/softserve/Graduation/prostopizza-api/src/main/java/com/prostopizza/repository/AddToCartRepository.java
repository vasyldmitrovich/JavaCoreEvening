package com.prostopizza.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.prostopizza.model.AddToCart;

@Repository
public interface AddToCartRepository extends JpaRepository<AddToCart,Long> {

    //remove cart by userId and cartId,
    //getCartByUserId

    @Query("Select sum(addCart.price*addCart.qty) FROM AddToCart addCart WHERE addCart.user_id=:user_id")
    double getTotalAmountByUserId(@Param("user_id")Long user_id);
    @Query("Select addCart  FROM AddToCart addCart WHERE addCart.user_id=:user_id")
    List<AddToCart> getCartByUserId(@Param("user_id")Long user_id);
    @Query("Select addCart  FROM AddToCart addCart ")
    Optional<AddToCart> getCartByUserIdTest();
    @Query("Select add_to_cart  FROM AddToCart add_to_cart WHERE add_to_cart.product.id=:product_id and add_to_cart.user_id=:user_id")
    Optional<AddToCart> getCartByProductIdAndUserId(@Param("user_id")Long user_id, @Param("product_id")Long product_id);
    @Modifying
    @Transactional
    @Query("DELETE  FROM AddToCart addCart WHERE addCart.id =:cart_id   and addCart.user_id=:user_id")
    void deleteCartByIdAndUserId(@Param("user_id")Long user_id,@Param("cart_id")Long cart_id);
    @Modifying
    @Transactional
    @Query("DELETE  FROM AddToCart addCart WHERE   addCart.user_id=:user_id")
    void deleteAllCartByUserId(@Param("user_id")Long user_id);

    @Modifying
    @Transactional
    @Query("DELETE  FROM AddToCart addCart WHERE addCart.user_id=:user_id")
    void deleteAllCartUserId(@Param("user_id")Long user_id);
    @Modifying
    @Transactional
    @Query("update AddToCart addCart set addCart.qty=:qty,addCart.price=:price WHERE addCart.id=:cart_id")
    void updateQtyByCartId(@Param("cart_id")Long cart_id,@Param("price")double price,@Param("qty")Integer qty);

}
