package com.fierte.entity.entity.products.category;

public class LanguageCategoryName {

    private Long language_id;
    private String category_name;

    public LanguageCategoryName(){}

    public LanguageCategoryName(Long language_id, String category_name){
        this.language_id = language_id;
        this.category_name = category_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

}
