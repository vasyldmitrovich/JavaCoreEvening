package com.prostopizza.controller;

import com.prostopizza.jwtConfiguration.ShoppingConfiguration;
import com.prostopizza.controller.request.ApiResponse;
import com.prostopizza.model.AddToCart;
import com.prostopizza.model.CheckoutCart;
import com.prostopizza.service.mailService.EmailService;
import com.prostopizza.service.cartService.CartService;
import com.prostopizza.service.productService.ProductServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("api/order")
public class OrderController {
    final
    CartService cartService;
    ProductServices proService;
    final EmailService emailService;
    public OrderController(CartService cartService, EmailService emailService) {
        this.cartService = cartService;
        this.emailService=emailService;
    }

    @RequestMapping("checkout_order")
    public ResponseEntity<?> checkout_order(@RequestBody HashMap<String,String> addCartRequest) {
        try {
            String[] keys = {"userId","total_price","pay_type","deliveryAddress"};
            ShoppingConfiguration.validationWithHashMap(keys, addCartRequest);
            long user_Id = Long.parseLong(addCartRequest.get("userId"));
            double total_amt = Double.parseDouble(addCartRequest.get("total_price"));
            if(cartService.checkTotalAmountAgainstCart(total_amt,user_Id)) {
                List<AddToCart> cartItems = cartService.getCartByUserId(user_Id);
                List<CheckoutCart> tmp = new ArrayList<>();
                String cartProducts="";
                for(AddToCart addCart : cartItems) {
                    String orderId = ""+getOrderId();
                    CheckoutCart cart = new CheckoutCart();
                    cart.setPayment_type(addCartRequest.get("pay_type"));
                    cart.setPrice(total_amt);
                    cart.setUser_id(user_Id);
                    cart.setOrder_id(orderId);
                    cart.setProduct(addCart.getProduct());
                    cart.setQty(addCart.getQty());
                    cart.setDelivery_address(addCartRequest.get("deliveryAddress"));
                    tmp.add(cart);
                    cartProducts=cartProducts.concat(addCart.getProductName());

                }
                System.out.println(cartProducts);
                cartService.saveProductsForCheckout(tmp);
                emailService.sendmail("order",cartProducts);
                return ResponseEntity.ok(new ApiResponse(true,"Checkout successful"));
            }else {
                throw new Exception("Total amount is mismatch");
            }
        }catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ApiResponse(false, e.getMessage()));
        }
    }
    public int getOrderId() {
        Random r = new Random( System.currentTimeMillis() );
        return 10000 + r.nextInt(20000);
    }
    @RequestMapping("getOrdersByUserId")
    public ResponseEntity<?> getOrdersByUserId(@RequestBody HashMap<String,String> ordersRequest) {
        try {
            String[] keys = {"userId"};
            return ResponseEntity.ok(new ApiResponse(true, "Order placed successfully"));
        }catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ApiResponse(false,e.getMessage()));
        }

    }
}
