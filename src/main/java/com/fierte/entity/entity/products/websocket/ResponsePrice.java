package com.fierte.entity.entity.products.websocket;

import com.fierte.entity.entity.products.products.Price;

public class ResponsePrice {

    private Long product_item_id;
    private boolean success;
    private Price price;

    public ResponsePrice(){}

    public ResponsePrice(Long product_item_id, boolean success, Price price){
        this.product_item_id = product_item_id;
        this.success = success;
        this.price = price;
    }

    public Long getProduct_item_id() {
        return product_item_id;
    }

    public void setProduct_item_id(Long product_item_id) {
        this.product_item_id = product_item_id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
