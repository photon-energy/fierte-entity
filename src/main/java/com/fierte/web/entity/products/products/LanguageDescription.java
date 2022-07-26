package com.fierte.web.entity.products.products;

public class LanguageDescription {

    private Long language_id;
    private String description;

    public LanguageDescription(){}

    public LanguageDescription(Long language_id, String description){
        this.language_id = language_id;
        this.description = description;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
