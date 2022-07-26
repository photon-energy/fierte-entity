package com.fierte.entity.entity.products.subcategory;

import com.fierte.entity.entity.products.category.LanguageDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import net.minidev.json.annotate.JsonIgnore;

public class SubCategory {

    private Long subcategory_id;
    private LanguageSubCategoryName[] language_subcategory_name;
    private com.fierte.entity.entity.products.category.LanguageDescription[] language_description;
    private Integer category_id;
    private String category_name;
    @JsonIgnore
    private String hash_name;
    private Integer status;
    private String created_time;

    public SubCategory() {}

    public SubCategory(Long subcategory_id, LanguageSubCategoryName[] language_subcategory_name, com.fierte.entity.entity.products.category.LanguageDescription[] language_description, Integer category_id, String category_name, String hash_name, Integer status, String created_time) {
        this.subcategory_id = subcategory_id;
        this.language_subcategory_name = language_subcategory_name;
        this.language_description = language_description;
        this.category_id = category_id;
        this.category_name = category_name;
        this.hash_name = hash_name;
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

    public LanguageSubCategoryName[] getLanguage_subcategory_name() {
        return language_subcategory_name;
    }

    public void setLanguage_subcategory_name(LanguageSubCategoryName[] language_subcategory_name) {
        this.language_subcategory_name = language_subcategory_name;
    }

    public com.fierte.entity.entity.products.category.LanguageDescription[] getLanguage_description() {
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

    @Schema(hidden = true)
    public String getCategory_name() {
        return category_name;
    }

    @Schema(hidden = true)
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Schema(hidden = true)
    private String getHash_name() {
        return hash_name;
    }

    @Schema(hidden = true)
    private void setHash_name(String hash_name) {
        this.hash_name = hash_name;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status){
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
