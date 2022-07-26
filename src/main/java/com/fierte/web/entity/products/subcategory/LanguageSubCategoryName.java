package com.fierte.web.entity.products.subcategory;

public class LanguageSubCategoryName {

    private Long language_id;
    private String subcategory_name;

    public LanguageSubCategoryName(){}

    public LanguageSubCategoryName(Long language_id, String subcategory_name){
        this.language_id = language_id;
        this.subcategory_name = subcategory_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

}
