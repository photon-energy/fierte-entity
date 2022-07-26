package com.fierte.entity.entity.users;

import io.swagger.v3.oas.annotations.media.Schema;

public class WishList {

    private Long wish_id;
    private Long user_id;
    private Long product_id;
    private Long product_items_id;
    private String created_time;

    public WishList(){}

    public WishList(Long wish_id, Long user_id, Long product_id, Long product_items_id, String created_time) {
        this.wish_id = wish_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getWish_id() {
        return wish_id;
    }

    @Schema(hidden = true)
    public void setWish_id(Long wish_id) {
        this.wish_id = wish_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    @Schema(hidden = true)
    public String getCreated_time() {
        return created_time;
    }

    @Schema(hidden = true)
    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
