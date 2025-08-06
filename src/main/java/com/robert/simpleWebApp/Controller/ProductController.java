package com.robert.simpleWebApp.Controller;

import com.robert.simpleWebApp.DTO.ProductDTO;
import com.robert.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
