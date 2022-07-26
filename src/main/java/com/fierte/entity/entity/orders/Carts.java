package com.fierte.entity.entity.orders;

import io.swagger.v3.oas.annotations.media.Schema;

public class Carts {

    private Long cart_id;
    private Long product_id;
    private Long product_items_id;
    private Long user_id;
    private Integer price;
    private Integer quantity;
    private String created_time;

    public Carts(){}

    public Carts(Long cart_id, Long product_id, Long product_items_id, Long user_id, Integer price, Integer quantity, String created_time){
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.user_id = user_id;
        this.price = price;
        this.quantity = quantity;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getCart_id() {
        return cart_id;
    }

    @Schema(hidden = true)
    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Schema(hidden = true)
    public String getCreated_time() {
        return created_time;
    }

    @Schema(hidden = true)
    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
