package com.stetsiv.lsjpa.service;

import com.stetsiv.lsjpa.entity.ProductCategory;
import com.stetsiv.lsjpa.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductCategoryService {

    private ProductCategoryRepository repository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    public Double getHighestPriceByCategory(String categoryName){
        ProductCategory productCategory = repository.findByName(categoryName)
                .orElseThrow(() -> new RuntimeException("Not found"));

        return productCategory.getProductSet().stream()
                .mapToDouble(e -> e.getPrice())
                .max().getAsDouble();
    }
}
