package com.stetsiv.lsjpa.repository;

import com.stetsiv.lsjpa.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
}
