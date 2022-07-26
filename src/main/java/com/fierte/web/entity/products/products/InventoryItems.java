package com.fierte.web.entity.products.products;

public class InventoryItems {

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
    private String purchase_price;
    private Integer quantity;
    private String[] photo;
    private Integer status;
    private String created_time;

    public InventoryItems(){}

    public InventoryItems(Long product_items_id, Long product_id, String product_name, Long supplier_id, String supplier_name, String brand_name, String bar_code,
                          String warehouse_location, String color, String composition,String gemsetting, String gender,  Double weight, Double[] length, Double width, Double height,
                          String purchase_price, Integer quantity, String[] photo, Integer status, String created_time){
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
        this.status = status;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getGemsetting() {
        return gemsetting;
    }

    public void setGemsetting(String gemsetting) {
        this.gemsetting = gemsetting;
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

    public String getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(String purchase_price) {
        this.purchase_price = purchase_price;
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

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
