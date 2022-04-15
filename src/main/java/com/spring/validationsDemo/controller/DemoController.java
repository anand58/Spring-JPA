package com.spring.validationsDemo.controller;

import com.spring.validationsDemo.entities.Product;
import com.spring.validationsDemo.respositories.ProductRepository;
import com.spring.validationsDemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")
public class DemoController {

    @Autowired
    ProductService productService;

    @GetMapping("msg/{id}")
    public String getMsg(@PathVariable(value = "id") Long id) {
        productService.updateProduct(id);
        return "Hello";
    }

    @GetMapping("msg")
    public String getMsg() {
        productService.updateProducts();
        return "Hello";
    }
}
