package com.prostopizza.controller;


import com.prostopizza.jwtConfiguration.ShoppingConfiguration;
import com.prostopizza.controller.request.ApiResponse;
import com.prostopizza.model.AddToCart;
import com.prostopizza.service.cartService.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api/addtocart")
public class AddToCartController {
    final
    CartService cartService;

    public AddToCartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("addProduct")
    public ResponseEntity<?> addCartWithProduct(@RequestBody HashMap<String,String> addCartRequest) {
        try {
            String[] keys = {"productId","userId","qty","price"};
            ShoppingConfiguration.validationWithHashMap(keys, addCartRequest);
            long productId = Long.parseLong(addCartRequest.get("productId"));
            long userId =  Long.parseLong(addCartRequest.get("userId"));
            int qty =  Integer.parseInt(addCartRequest.get("qty"));
            double price = Double.parseDouble(addCartRequest.get("price"));
            List<AddToCart> obj = cartService.addCartByUserIdAndProductId(productId,userId,qty,price);
            return ResponseEntity.ok(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ApiResponse(false, e.getMessage()));
        }

    }

    @RequestMapping("updateQtyForCart")
    public ResponseEntity<?> updateQtyForCart(@RequestBody HashMap<String,String> addCartRequest) {
        try {
            String[] keys = {"cartId","userId","qty","price"};
            ShoppingConfiguration.validationWithHashMap(keys, addCartRequest);
            long cartId = Long.parseLong(addCartRequest.get("cartId"));
            long userId =  Long.parseLong(addCartRequest.get("userId"));
            int qty =  Integer.parseInt(addCartRequest.get("qty"));
            double price = Double.parseDouble(addCartRequest.get("price"));
            cartService.updateQtyByCartId(cartId, qty, price);
            List<AddToCart> obj = cartService.getCartByUserId(userId);
            return ResponseEntity.ok(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ApiResponse(false, e.getMessage()));
        }

    }


    @RequestMapping("removeProductFromCart")
    public ResponseEntity<?> removeCartWithProductId(@RequestBody HashMap<String,String> removeCartRequest) {
        try {
            String[] keys = {"userId","cartId"};
            ShoppingConfiguration.validationWithHashMap(keys, removeCartRequest);
            List<AddToCart> obj = cartService.removeCartByUserId(Long.parseLong(removeCartRequest.get("cartId")), Long.parseLong(removeCartRequest.get("userId")));
            return ResponseEntity.ok(obj);
        }catch(Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse(false, e.getMessage()));
        }
    }

    @RequestMapping("getCartsByUserId")
    public ResponseEntity<?> getCartsByUserId(@RequestBody HashMap<String,String> getCartRequest) {
        try {
            String[] keys = {"userId"};
            ShoppingConfiguration.validationWithHashMap(keys, getCartRequest);
            List<AddToCart> obj = cartService.getCartByUserId(Long.parseLong(getCartRequest.get("userId")));
            return ResponseEntity.ok(obj);
        }catch(Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse(false, e.getMessage()));
        }
    }
}
