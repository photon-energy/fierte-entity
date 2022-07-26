package com.fierte.entity.entity.products.products;

import io.swagger.v3.oas.annotations.media.Schema;

public class Products {

    private Long product_id;
    private LanguageProductName[] language_product_name;
    private LanguageDescription[] language_description;
    private Integer category_id;
    private Integer subcategory_id;
    private ProductItems[] product_items;
    private Integer status;
    private String created_time;

    public Products() {}

    public Products(Long product_id, LanguageProductName[] language_product_name, LanguageDescription[] language_description,
                    Integer category_id, Integer subcategory_id, ProductItems[] product_items,
                    Integer status, String created_time) {
        this.product_id = product_id;
        this.language_product_name = language_product_name;
        this.language_description = language_description;
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.product_items = product_items;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getProduct_id(){
        return this.product_id;
    }

    @Schema(hidden = true)
    public void setProduct_id(Long product_id){
        this.product_id = product_id;
    }

    public LanguageProductName[] getLanguage_product_name() {
        return language_product_name;
    }

    public void setLanguage_product_name(LanguageProductName[] language_product_name) {
        this.language_product_name = language_product_name;
    }

    public LanguageDescription[] getLanguage_description() {
        return language_description;
    }

    public void setLanguage_description(LanguageDescription[] language_description) {
        this.language_description = language_description;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(Integer subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public ProductItems[] getProduct_items() {
        return product_items;
    }

    public void setProduct_items(ProductItems[] product_items) {
        this.product_items = product_items;
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
    public void setCreated_time(String time) {
        this.created_time = time;
    }

}
