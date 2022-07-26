package com.fierte.entity.entity.products.products.banner;

public class LanguageBannerTitle {

    private Long language_id;
    private String banner_title;

    public LanguageBannerTitle(){}

    public LanguageBannerTitle(Long language_id, String banner_title) {
        this.language_id = language_id;
        this.banner_title = banner_title;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getBanner_title() {
        return banner_title;
    }

    public void setBanner_title(String banner_title) {
        this.banner_title = banner_title;
    }
}
