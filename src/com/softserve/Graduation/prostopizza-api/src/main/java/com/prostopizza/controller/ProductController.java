package com.prostopizza.controller;

import com.prostopizza.model.Ingredients;
import com.prostopizza.model.Products;
import com.prostopizza.model.ProductsIngredient;
import com.prostopizza.service.productService.ProductServices;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("api/product")
@ResponseBody
public class ProductController {
    final
    ProductServices ProductServices;

    public ProductController(ProductServices ProductServices) {
        this.ProductServices = ProductServices;
    }

    @RequestMapping("getAll")
    public List<Products> getAllProducts(){
        return ProductServices.getAllProducts();
    }

    @RequestMapping("getIngredients/{id}")
    public List<Ingredients> getAllIngredientsByProductId(@PathVariable String id){ return ProductServices.getIngredientByProductId(Long.parseLong(id));}

    @RequestMapping("getIngredients")
    public List<ProductsIngredient> getAllIngredients(){return ProductServices.getAllIngredients();}

    @RequestMapping( value = "/getImage/{img_name}",produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody
    byte[] getImageWithMediaType(@PathVariable("img_name") String img_name) throws IOException {
        InputStream in = getClass().getResourceAsStream("/images/"+img_name);
        return IOUtils.toByteArray(in);
    }


}
