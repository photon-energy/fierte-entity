package com.fierte.entity.entity.products.products;

import java.sql.Array;

public class ProductItemsWebSocket {

    private Long product_items_id;
    private Long product_id;
    private String product_name;
    private Long supplier_id;
    private String supplier_name;
    private String brand_name;
    private String bar_code;
    private String warehouse_location;
    private String color;
    private String composition;
    private String gemsetting;
    private String gender;
    private Double weight;
    private Double[] length;
    private Double width;
    private Double height;
    private Integer purchase_price;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer quantity;
    private String[] photo;
    private Integer status;
    private boolean delete_status;
    private String updated_time;
    private String created_time;


    public ProductItemsWebSocket(){}

    public ProductItemsWebSocket(Long product_items_id, Long product_id, String product_name, Long supplier_id, String supplier_name, String brand_name, String bar_code,
                          String warehouse_location, String color, String composition,String gemsetting, String gender, Double weight, Double[] length, Double width, Double height,
                                 Integer purchase_price,
                                 Integer price, Integer promotion_price, Integer discount, Integer quantity, String[] photo,
                                 Integer status, boolean delete_status, String updated_time, String created_time){
        this.product_items_id = product_items_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.brand_name = brand_name;
        this.bar_code = bar_code;
        this.warehouse_location = warehouse_location;
        this.color = color;
        this.composition = composition;
        this.gemsetting = gemsetting;
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.quantity = quantity;
        this.photo = photo;
        this.purchase_price = purchase_price;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.status = status;
        this.delete_status = delete_status;
        this.updated_time = updated_time;
        this.created_time = created_time;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getGemsetting() {
        return gemsetting;
    }

    public void setGemsetting(String gemsetting) {
        this.gemsetting = gemsetting;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getWarehouse_location() {
        return warehouse_location;
    }

    public void setWarehouse_location(String warehouse_location) {
        this.warehouse_location = warehouse_location;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double[] getLength() {
        return length;
    }

    public void setLength(Double[] length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean isDelete_status() {
        return delete_status;
    }

    public void setDelete_status(boolean delete_status) {
        this.delete_status = delete_status;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

}
