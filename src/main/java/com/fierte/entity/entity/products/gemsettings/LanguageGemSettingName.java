package com.fierte.entity.entity.products.gemsettings;

public class LanguageGemSettingName {

    private Long language_id;
    private String gemsetting_name;

    public LanguageGemSettingName() {
    }

    public LanguageGemSettingName(Long language_id, String gemsetting_name) {
        this.language_id = language_id;
        this.gemsetting_name = gemsetting_name;
    }

    public String getGemsetting_name() {
        return gemsetting_name;
    }

    public void setGemsetting_name(String gemsetting_name) {
        this.gemsetting_name = gemsetting_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

}
