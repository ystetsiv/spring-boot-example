package com.stetsiv.lsjpa.service;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.entity.ProductAudit;
import com.stetsiv.lsjpa.repository.ProductAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAuditService {

    private ProductAuditRepository productAuditRepository;

    @Autowired
    public ProductAuditService(ProductAuditRepository productAuditRepository) {
        this.productAuditRepository = productAuditRepository;
    }

    public void logProduct(Product product) {
        ProductAudit audit = new ProductAudit();
        audit.setId(product.getId());
        productAuditRepository.save(audit);

    }
}
