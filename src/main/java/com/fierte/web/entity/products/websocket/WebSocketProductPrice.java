package com.fierte.web.entity.products.websocket;

public class WebSocketProductPrice {

    private Long product_id;
    private Long product_item_id;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer is_promotion;
    private String expire_date_start;
    private String expire_date_end;

    public WebSocketProductPrice(){}

    public WebSocketProductPrice(Long product_id, Long product_item_id, Integer price, Integer promotion_price,
                                 Integer discount, Integer is_promotion, String expire_date_start, String expire_date_end) {
        this.product_id = product_id;
        this.product_item_id = product_item_id;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.is_promotion = is_promotion;
        this.expire_date_start = expire_date_start;
        this.expire_date_end = expire_date_end;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getProduct_item_id() {
        return product_item_id;
    }

    public void setProduct_item_id(Long product_item_id) {
        this.product_item_id = product_item_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(Integer promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getIs_promotion() {
        return is_promotion;
    }

    public void setIs_promotion(Integer is_promotion) {
        this.is_promotion = is_promotion;
    }

    public String getExpire_date_start() {
        return expire_date_start;
    }

    public void setExpire_date_start(String expire_date_start) {
        this.expire_date_start = expire_date_start;
    }

    public String getExpire_date_end() {
        return expire_date_end;
    }

    public void setExpire_date_end(String expire_date_end) {
        this.expire_date_end = expire_date_end;
    }
}
