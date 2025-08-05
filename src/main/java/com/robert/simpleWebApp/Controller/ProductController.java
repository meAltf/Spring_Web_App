package com.robert.simpleWebApp.Controller;

import com.robert.simpleWebApp.DTO.ProductDTO;
import com.robert.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
