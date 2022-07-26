package com.fierte.entity.entity.products.gendertype;

public class LanguageGenderName {

    private Long language_id;
    private String gender_name;

    public LanguageGenderName(){}

    public LanguageGenderName(Long language_id, String gender_name){
        this.language_id = language_id;
        this.gender_name = gender_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }
}
