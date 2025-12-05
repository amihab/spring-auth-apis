package com.example.auth.controller;

import com.example.auth.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    List<Product> productsList = List.of(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 499.49),
            new Product(3L, "Tablet", 299.29)
    );

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productsList;
    }
}
