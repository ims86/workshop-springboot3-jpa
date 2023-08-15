package com.ims.coursespring3.repositories;

import com.ims.coursespring3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
