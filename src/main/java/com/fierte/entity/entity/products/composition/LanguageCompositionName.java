package com.fierte.entity.entity.products.composition;

public class LanguageCompositionName {

    private Long language_id;
    private String composition_name;

    public LanguageCompositionName(){}

    public LanguageCompositionName(Long language_id, String composition_name){
        this.language_id = language_id;
        this.composition_name = composition_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getComposition_name() {
        return composition_name;
    }

    public void setComposition_name(String composition_name) {
        this.composition_name = composition_name;
    }
}
