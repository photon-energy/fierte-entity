package com.fierte.web.entity.products.products;

public class UpdatePPStatus {

    private Long product_id;
    private Integer status;

    public UpdatePPStatus(){}

    public UpdatePPStatus(Long product_id, Integer status){
        this.product_id = product_id;
        this.status = status;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
