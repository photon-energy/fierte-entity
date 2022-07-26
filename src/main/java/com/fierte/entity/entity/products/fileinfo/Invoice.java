package com.fierte.entity.entity.products.fileinfo;

public class Invoice {

    private String order_number;
    private Long order_id;

    public Invoice(){}

    public Invoice(String order_number, Long order_id) {
        this.order_number = order_number;
        this.order_id = order_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}
