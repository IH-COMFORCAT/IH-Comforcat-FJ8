package com.ironhack.lab406.Controllers;

import com.ironhack.lab406.DTO.ProductDTO;
import com.ironhack.lab406.Services.ProductService;
import com.ironhack.lab406.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/new-product")
    public Product createProduct(@RequestBody ProductDTO productDTO){
        return productService.createNewProduct(productDTO);
    }

    @PatchMapping("/decrease-quantity")
    public Product decreaseQuantity(@RequestParam Integer productId, @RequestParam Integer quantity){
        return productService.decreaseProductQuantity(productId, quantity);
    }

    @GetMapping("/product-department/{department}")
    public List<Product> findByDepartment(@PathVariable String department){
        return productService.findProductByDepartment(department);
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findProductById(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteById(@PathVariable Integer id){
        productService.deleteProductById(id);
    }
}
