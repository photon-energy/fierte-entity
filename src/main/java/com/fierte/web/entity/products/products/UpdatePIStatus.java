package com.fierte.web.entity.products.products;

public class UpdatePIStatus {

    private Long product_id;
    private Long product_items_id;
    private Integer status;

    public UpdatePIStatus(){}

    public UpdatePIStatus(Long product_id, Long product_items_id, Integer status){
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.status = status;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
