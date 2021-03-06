package com.stetsiv.lsjpa.repository;

import com.stetsiv.lsjpa.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

    Optional<ProductCategory> findByName(String name);
}
