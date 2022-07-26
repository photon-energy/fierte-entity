package com.fierte.entity.entity.products.products;

import io.swagger.v3.oas.annotations.media.Schema;

public class ProductItems {

    private Long product_items_id;
    private Long product_id;
    private Long supplier_id;
    private Long brand_id;
    private String brand_name;
    private String bar_code;
    private ProductProperties properties;
    private String[] photo;
    private String url_product;
    private String warehouse_location;
    private Integer quantity;
    private Price price;
    private String[] tags;
    private Integer status;
    private String created_time;

    public ProductItems(){}

    public ProductItems(Long product_items_id, Long product_id, Long supplier_id, Long brand_id, String brand_name, String bar_code, ProductProperties properties, String[] photo,
                        String url_product, String warehouse_location, Integer quantity, Price price, String[] tags, Integer status, String created_time){
        this.product_items_id = product_items_id;
        this.product_id = product_id;
        this.supplier_id = supplier_id;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.bar_code = bar_code;
        this.properties = properties;
        this.photo = photo;
        this.url_product = url_product;
        this.warehouse_location = warehouse_location;
        this.quantity = quantity;
        this.price = price;
        this.tags = tags;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getProduct_items_id() {
        return product_items_id;
    }

    @Schema(hidden = true)
    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    @Schema(hidden = true)
    public Long getProduct_id() {
        return product_id;
    }

    @Schema(hidden = true)
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    @Schema(hidden = true)
    public Long getSupplier_id() {
        return supplier_id;
    }

    @Schema(hidden = true)
    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    @Schema(hidden = true)
    public String getBrand_name() {
        return brand_name;
    }

    @Schema(hidden = true)
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public ProductProperties getProperties() {
        return properties;
    }

    public void setProperties(ProductProperties properties) {
        this.properties = properties;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    @Schema(hidden = true)
    public String getUrl_product() {
        return url_product;
    }

    @Schema(hidden = true)
    public void setUrl_product(String url_product) {
        this.url_product = url_product;
    }

    @Schema(hidden = true)
    public String getWarehouse_location() {
        return warehouse_location;
    }

    @Schema(hidden = true)
    public void setWarehouse_location(String warehouse_location) {
        this.warehouse_location = warehouse_location;
    }

    @Schema(hidden = true)
    public Integer getQuantity() {
        return quantity;
    }

    @Schema(hidden = true)
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Schema(hidden = true)
    private Price getPrice() {
        return price;
    }

    @Schema(hidden = true)
    public void setPrice(Price price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
