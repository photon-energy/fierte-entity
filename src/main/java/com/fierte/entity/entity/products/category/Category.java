package com.fierte.entity.entity.products.category;

import io.swagger.v3.oas.annotations.media.Schema;

public class Category {
    
    private Long category_id;
    private LanguageCategoryName[] language_category_name;
    private LanguageDescription[] language_description;
    private String[] photo;
    private Integer status;
    private String created_time;

    public Category(){}

    public Category(Long category_id, LanguageCategoryName[] language_category_name, LanguageDescription[] language_description, String[] photo, Integer status, String created_time) {
        this.category_id = category_id;
        this.language_category_name = language_category_name;
        this.language_description = language_description;
        this.photo = photo;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getCategory_id(){
        return this.category_id;
    }

    @Schema(hidden = true)
    public void setCategory_id(Long category_id){
        this.category_id = category_id;
    }

    public LanguageCategoryName[] getLanguage_category_name() {
        return language_category_name;
    }

    public void setLanguage_category_name(LanguageCategoryName[] language_category_name) {
        this.language_category_name = language_category_name;
    }

    public LanguageDescription[] getLanguage_description() {
        return language_description;
    }

    public void setLanguage_description(LanguageDescription[] language_description) {
        this.language_description = language_description;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
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
