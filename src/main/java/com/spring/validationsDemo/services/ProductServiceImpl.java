package com.spring.validationsDemo.services;

import com.spring.validationsDemo.entities.Product;
import com.spring.validationsDemo.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    @Transactional
    public void updateProduct(Long id) {
        Product p = productRepository.getById(id);
        p.setDescription("This is the description for "+p.getName());
        productRepository.save(p);
    }

    @Transactional
    public void updateProducts() {
        productRepository
                .findAll()
                .forEach(product -> {
                    product.setDescription("This is the description for "+product.getName());
                    productRepository.save(product);
        });
    }
}
