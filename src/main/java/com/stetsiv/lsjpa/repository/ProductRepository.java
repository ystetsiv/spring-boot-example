package com.stetsiv.lsjpa.repository;

import com.stetsiv.lsjpa.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
