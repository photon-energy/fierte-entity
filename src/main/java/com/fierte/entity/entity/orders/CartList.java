package com.fierte.entity.entity.orders;

import com.fierte.entity.entity.products.products.StoreSingleProduct;

public class CartList {

    private Long cart_id;
    private Long product_items_id;
    private StoreSingleProduct product_items;
    private Long user_id;
    private Integer price;
    private Integer quantity;
    private String created_time;

    public CartList(){}

    public CartList(Long cart_id, Long product_items_id, StoreSingleProduct product_items, Long user_id, Integer price, Integer quantity, String created_time){
        this.cart_id = cart_id;
        this.product_items_id = product_items_id;
        this.product_items = product_items;
        this.user_id = user_id;
        this.price = price;
        this.quantity = quantity;
        this.created_time = created_time;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public StoreSingleProduct getProduct_items() {
        return product_items;
    }

    public void setProduct_items(StoreSingleProduct product_items) {
        this.product_items = product_items;
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

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
