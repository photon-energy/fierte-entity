package com.fierte.web.entity.products.websocket;

public class WebSocketProductItems {

    private Long product_id;

    public WebSocketProductItems(){}

    public WebSocketProductItems(Long product_id){
        this.product_id = product_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }
}
