package com.fierte.web.entity.products.products;

public class Price {

    private Long price_id;
    private Long product_id;
    private Long product_items_id;
    private Integer purchase_price;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer is_promotion;
    private String expire_date_promotion_start;
    private String expire_date_promotion_end;
    private String created_time;

    public Price(){}

    public Price(Long price_id, Long product_id, Long product_items_id, Integer purchase_price, Integer price, Integer promotion_price,
                 Integer discount, Integer is_promotion, String expire_date_promotion_start, String expire_date_promotion_end, String created_time){
        this.price_id = price_id;
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.purchase_price = purchase_price;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.is_promotion = is_promotion;
        this.expire_date_promotion_start = expire_date_promotion_start;
        this.expire_date_promotion_end = expire_date_promotion_end;
        this.created_time = created_time;
    }

    private Long getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Long price_id) {
        this.price_id = price_id;
    }

    private Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    private Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Integer getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Integer purchase_price) {
        this.purchase_price = purchase_price;
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

    public Integer isIs_promotion() {
        return is_promotion;
    }

    public void setIs_promotion(Integer is_promotion) {
        this.is_promotion = is_promotion;
    }

    public String getExpire_date_promotion_start() {
        return expire_date_promotion_start;
    }

    public void setExpire_date_promotion_start(String expire_date_promotion_start) {
        this.expire_date_promotion_start = expire_date_promotion_start;
    }

    public String getExpire_date_promotion_end() {
        return expire_date_promotion_end;
    }

    public void setExpire_date_promotion_end(String expire_date_promotion_end) {
        this.expire_date_promotion_end = expire_date_promotion_end;
    }

    private String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
