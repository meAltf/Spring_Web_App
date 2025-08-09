package com.robert.simpleWebApp.Service;

import com.robert.simpleWebApp.DTO.ProductDTO;
import com.robert.simpleWebApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    /**
    List<ProductDTO> products = new ArrayList<>(Arrays.asList(
            new ProductDTO(101, "macbook", 87000.0),
            new ProductDTO(102, "Iphone", 450000.0)
    ));
    **/
    public List<ProductDTO> getProducts() {
        return productRepository.findAll();
    }

    public ProductDTO getProductById(int prodId) {

        return productRepository.findById(prodId).orElse(new ProductDTO());

//        return products.stream().filter(product -> product.getProductId() == prodId)
//                .findFirst()
//                .orElse(new ProductDTO(100, "No Item", 0.0));

    }

    public void addProduct(ProductDTO productDTO) {
        productRepository.save(productDTO);
    }

    public void updateProduct(ProductDTO productDTO) {

        productRepository.save(productDTO);
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProductId() == productDTO.getProductId()) {
//                index = i;
//            }
//        }
//        products.set(index, productDTO);
    }

    public void deleteProducctById(int productId) {

        productRepository.deleteById(productId);

//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProductId() == productId) {
//                index = i;
//            }
//        }
//        products.remove(index);
    }
}
