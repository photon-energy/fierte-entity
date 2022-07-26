package com.fierte.entity.entity.products.products;

public class PromotionProducts {

    private Long product_id;
    private Long product_items_id;
    private String product_name;
    private Long category_id;
    private String category_name;
    private Long subcategory_id;
    private String subcategory_name;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private String[] photo;
    private Integer is_promotion;
    private String expire_date_promotion_start;
    private String expire_date_promotion_end;

    public PromotionProducts(){}

    public PromotionProducts(Long product_id, Long product_items_id, String product_name, Long category_id, String category_name, Long subcategory_id, String subcategory_name, Integer price,
                             Integer promotion_price, Integer discount, String[] photo, Integer is_promotion, String expire_date_promotion_start, String expire_date_promotion_end) {
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.product_name = product_name;
        this.category_id = category_id;
        this.category_name = category_name;
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.photo = photo;
        this.is_promotion = is_promotion;
        this.expire_date_promotion_start = expire_date_promotion_start;
        this.expire_date_promotion_end = expire_date_promotion_end;
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

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(Long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
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

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public Integer getIs_promotion() {
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
}
