package com.stetsiv.lsjpa.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductCart {

    private List<Product> products;

    public ProductCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public int getNumberOfProducts(){
        return products.size();
    }
}
