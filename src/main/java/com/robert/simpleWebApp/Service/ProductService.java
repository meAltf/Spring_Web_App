package com.robert.simpleWebApp.Service;

import com.robert.simpleWebApp.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<ProductDTO> products = new ArrayList<>(Arrays.asList(
            new ProductDTO(101, "macbook", 87000.0),
            new ProductDTO(102, "Iphone", 450000.0)
    ));

    public List<ProductDTO> getProducts() {
        return products;
    }

    public ProductDTO getProductById(int prodId) {
        return products.stream().filter(product -> product.getProductId() == prodId)
                .findFirst()
                .orElse(new ProductDTO(100, "No Item", 0.0));

    }

    public void addProduct(ProductDTO productDTO) {
        products.add(productDTO);
    }
}
