package com.robert.simpleWebApp.Repository;

import com.robert.simpleWebApp.DTO.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDTO, Integer> {


}
