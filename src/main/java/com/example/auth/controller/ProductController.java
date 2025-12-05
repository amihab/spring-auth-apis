package com.example.auth.controller;

import com.example.auth.config.AppProperties;
import com.example.auth.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final AppProperties appProperties;

    public ProductController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return appProperties.getProducts();
    }
}
