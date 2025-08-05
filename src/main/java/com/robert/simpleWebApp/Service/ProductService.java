package com.robert.simpleWebApp.Service;

import com.robert.simpleWebApp.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<ProductDTO> products = Arrays.asList(
            new ProductDTO(101, "macbook", 87000.0),
            new ProductDTO(102, "Iphone", 450000.0)
    );

    public List<ProductDTO> getProducts() {
        return products;
    }
}
