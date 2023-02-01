package com.prostopizza.service.cartService;

import com.prostopizza.model.AddToCart;
import com.prostopizza.model.CheckoutCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    List<AddToCart> addCartByUserIdAndProductId(long productId, long userId, int qty, double price) throws Exception;
    void updateQtyByCartId(long cartId,int qty,double price);
    List<AddToCart> getCartByUserId(long userId);
    List<AddToCart> removeCartByUserId(long cartId, long userId);
    List<AddToCart> removeAllCartByUserId(long userId);
    Boolean checkTotalAmountAgainstCart(double totalAmount,long userId);
    List<CheckoutCart> getAllCheckoutByUserId(long userId);
    void saveProductsForCheckout(List<CheckoutCart> tmp)  throws Exception;


    //CheckOutCart
}
