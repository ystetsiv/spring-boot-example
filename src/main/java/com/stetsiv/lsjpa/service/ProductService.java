package com.stetsiv.lsjpa.service;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductAuditService productAuditService;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public ProductService(ProductRepository productRepository, ProductAuditService productAuditService) {
        this.productAuditService = productAuditService;
        this.productRepository = productRepository;
    }

    public Product saveWithAudit(Product product){
        Product newProduct = productRepository.save(product);
        productAuditService.logProduct(product);
        return newProduct;
    }

    public Product simpleSave(Product product){

//        if(true){
//            return new Product();
//        }

        return productRepository.save(product);
    }
}
