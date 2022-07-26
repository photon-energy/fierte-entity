package com.fierte.entity.entity.products.subcategory;

import io.swagger.v3.oas.annotations.media.Schema;

public class SubCategoryList {

    private Long subcategory_id;
    private String subcategory_name;
    private String description;
    private Integer category_id;
    private String category_name;
    private Integer status;
    private String created_time;

    public SubCategoryList() {}

    public SubCategoryList(Long subcategory_id, String subcategory_name, String description, Integer category_id, String category_name, Integer status, String created_time) {
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.description = description;
        this.category_id = category_id;
        this.category_name = category_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getSubcategory_id() {
        return subcategory_id;
    }

    @Schema(hidden = true)
    public void setSubcategory_id(Long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
