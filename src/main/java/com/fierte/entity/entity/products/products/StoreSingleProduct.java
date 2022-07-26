package com.fierte.entity.entity.products.products;

public class StoreSingleProduct {

    private Long product_id;
    private Long product_items_id;
    private String product_name;
    private String subcategory_name;
    private String description;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer is_promotion;
    private String warehouse;
    private ProductProperties properties;
    private String expire_date_promotion_start;
    private String expire_date_promotion_end;
    private String color;
    private String color_code;
    private String composition;
    private String gemsetting;
    private String gender;
    private String[] photo;
    private boolean is_wish;

    public StoreSingleProduct(){}

    public String getGemsetting() {
        return gemsetting;
    }

    public void setGemsetting(String gemsetting) {
        this.gemsetting = gemsetting;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public StoreSingleProduct(Long product_id, Long product_items_id, String product_name, String subcategory_name, String description, Integer price, Integer promotion_price, Integer discount, Integer is_promotion, String warehouse,
                              ProductProperties properties, String expire_date_promotion_start, String expire_date_promotion_end, String color, String color_code, String composition, String gemsetting, String gender, String[] photo, boolean is_wish) {
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.product_name = product_name;
        this.subcategory_name = subcategory_name;
        this.description = description;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.is_promotion = is_promotion;
        this.warehouse = warehouse;
        this.properties = properties;
        this.expire_date_promotion_start = expire_date_promotion_start;
        this.expire_date_promotion_end = expire_date_promotion_end;
        this.color = color;
        this.color_code = color_code;
        this.composition = composition;
        this.gemsetting = gemsetting;
        this.gender = gender;
        this.photo = photo;
        this.is_wish = is_wish;
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

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public ProductProperties getProperties() {
        return properties;
    }

    public void setProperties(ProductProperties properties) {
        this.properties = properties;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public boolean isIs_wish() {
        return is_wish;
    }

    public void setIs_wish(boolean is_wish) {
        this.is_wish = is_wish;
    }
}
