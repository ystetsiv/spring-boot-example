package com.stetsiv.lsjpa.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_audit")
public class ProductAudit {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long productId;

    @CreationTimestamp
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime modufyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getModufyDate() {
        return modufyDate;
    }

    public void setModufyDate(LocalDateTime modufyDate) {
        this.modufyDate = modufyDate;
    }
}
