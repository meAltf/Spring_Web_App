package com.robert.simpleWebApp.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductDTO {

    @Id
    private int productId;
    private String productName;
    private double price;

    /**
    public ProductDTO(){

    }

    public ProductDTO(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

     **/
}
