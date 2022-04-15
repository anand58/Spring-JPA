package com.spring.validationsDemo.respositories;

import com.spring.validationsDemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
