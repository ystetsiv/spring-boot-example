package com.stetsiv.lsjpa;

import com.stetsiv.lsjpa.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Container {


    @Bean
    public ProductService productService(){ return new ProductService(); }
}
