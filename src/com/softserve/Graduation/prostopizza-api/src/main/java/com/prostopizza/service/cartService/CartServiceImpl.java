package com.prostopizza.service.cartService;

import com.prostopizza.model.AddToCart;
import com.prostopizza.model.CheckoutCart;
import com.prostopizza.model.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.prostopizza.repository.AddToCartRepository;
import com.prostopizza.repository.CheckoutRepository;
import com.prostopizza.service.productService.ProductServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    final
    AddToCartRepository addCartRepo;
    final
    CheckoutRepository checkOutRepo;
    final
    ProductServices proServices;
    private static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);

    public CartServiceImpl(AddToCartRepository addCartRepo, CheckoutRepository checkOutRepo, ProductServices proServices) {
        this.addCartRepo = addCartRepo;
        this.checkOutRepo = checkOutRepo;
        this.proServices = proServices;
    }

    @Override
    public List<AddToCart> addCartByUserIdAndProductId(long productId, long userId, int qty, double price) throws Exception {
        try {
            if(addCartRepo.getCartByProductIdAndUserId(userId, productId).isPresent()){
                throw new Exception("Product is already exist.");
            }
            AddToCart obj = new AddToCart();
            obj.setQty(qty);
            obj.setUser_id(userId);
            Products pro = proServices.getProductsById(productId);
            obj.setProduct(pro);
            obj.setPrice(price);
            addCartRepo.save(obj);
            return this.getCartByUserId(userId);
        }catch(Exception e) {
            e.printStackTrace();
            logger.error(""+e.getMessage());
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public List<AddToCart> getCartByUserId(long userId) {
        return addCartRepo.getCartByUserId(userId);
    }

    @Override
    public List<AddToCart> removeCartByUserId(long cartId, long userId) {
        addCartRepo.deleteCartByIdAndUserId(userId, cartId);
        return this.getCartByUserId(userId);
    }

    @Override
    public void updateQtyByCartId(long cartId, int qty, double price) {
        addCartRepo.updateQtyByCartId(cartId,price,qty);
    }

    @Override
    public Boolean checkTotalAmountAgainstCart(double totalAmount,long userId) {
        double total_amount =addCartRepo.getTotalAmountByUserId(userId);
        if(total_amount == totalAmount) {
            return true;
        }
        System.out.print("Error from request "+total_amount +" --db-- "+ totalAmount);
        return false;
    }

    @Override
    public List<CheckoutCart> getAllCheckoutByUserId(long userId) {
        return checkOutRepo.getByUserId(userId);
    }

    @Override
    public void saveProductsForCheckout(List<CheckoutCart> tmp) throws Exception {
        try {
            long user_id = tmp.get(0).getUser_id();
            if(tmp.size() >0) {
                checkOutRepo.saveAll(tmp);
                this.removeAllCartByUserId(user_id);
                this.getAllCheckoutByUserId(user_id);
            }
            else {
                throw  new Exception("Should not be empty");
            }
        }catch(Exception e) {
            throw new Exception("Error while checkout "+e.getMessage());
        }

    }

    @Override
    public List<AddToCart> removeAllCartByUserId(long userId) {
        addCartRepo.deleteAllCartByUserId(userId);
        return null;
    }

}
