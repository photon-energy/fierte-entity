package com.fierte.entity.entity.products.color;

public class LanguageColorName {

    private Long language_id;
    private String color_name;

    public LanguageColorName(){}

    public LanguageColorName(Long language_id, String color_name){
        this.language_id = language_id;
        this.color_name = color_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }
}
