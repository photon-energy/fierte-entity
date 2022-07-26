package com.fierte.entity.entity.products.products.banner;


import io.swagger.v3.oas.annotations.media.Schema;

public class Banner {

    private Long banner_id;
    private LanguageBannerTitle[] language_title;
    private LanguageBannerDescription[] language_description;
    private String[] photo;
    private Integer status;
    private String created_time;

    public Banner(){}

    public Banner(Long banner_id, LanguageBannerTitle[] language_title, LanguageBannerDescription[] language_description, String[] photo, Integer status, String created_time) {
        this.banner_id = banner_id;
        this.language_title = language_title;
        this.language_description = language_description;
        this.photo = photo;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getBanner_id() {
        return banner_id;
    }

    @Schema(hidden = true)
    public void setBanner_id(Long banner_id) {
        this.banner_id = banner_id;
    }

    public LanguageBannerTitle[] getLanguage_title() {
        return language_title;
    }

    public void setLanguage_title(LanguageBannerTitle[] language_title) {
        this.language_title = language_title;
    }

    public LanguageBannerDescription[] getLanguage_description() {
        return language_description;
    }

    public void setLanguage_description(LanguageBannerDescription[] language_description) {
        this.language_description = language_description;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
