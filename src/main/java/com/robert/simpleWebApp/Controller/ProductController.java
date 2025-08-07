package com.robert.simpleWebApp.Controller;

import com.robert.simpleWebApp.DTO.ProductDTO;
import com.robert.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/getProduct/{prodId}")
    public ProductDTO getProductById(@PathVariable("prodId") int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductDTO productDTO) {
        System.out.println(productDTO);
        productService.addProduct(productDTO);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody ProductDTO productDTO) {
        productService.updateProduct(productDTO);
    }

    @DeleteMapping("/deleteProductById/{prodId}")
    public void deleteProductById(@PathVariable("prodId") int productId) {
        productService.deleteProducctById(productId);
    }
}
