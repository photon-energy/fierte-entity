package com.fierte.entity.entity.products.products.banner;

public class LanguageBannerDescription {

    private Long language_id;
    private String description;

    public LanguageBannerDescription(){}

    public LanguageBannerDescription(Long language_id, String description){
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
