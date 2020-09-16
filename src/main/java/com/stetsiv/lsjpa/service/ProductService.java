package com.stetsiv.lsjpa.service;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product){
        return repository.save(product);
    }
}
