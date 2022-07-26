package com.fierte.entity.entity.languages;

import io.swagger.v3.oas.annotations.media.Schema;

public class Language {

    private Long language_id;
    private String language_icon;
    private String language_locale;
    private String language_text;
    private Integer status;
    private String created_time;

    public Language(){}

    public Language(Long language_id, String language_icon, String language_locale, String language_text, Integer status, String created_time){
        this.language_id = language_id;
        this.language_icon = language_icon;
        this.language_locale = language_locale;
        this.language_text = language_text;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getLanguage_id() {
        return language_id;
    }

    @Schema(hidden = true)
    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getLanguage_icon() {
        return language_icon;
    }

    public void setLanguage_icon(String language_icon) {
        this.language_icon = language_icon;
    }

    public String getLanguage_locale() {
        return language_locale;
    }

    public void setLanguage_locale(String language_locale) {
        this.language_locale = language_locale;
    }

    public String getLanguage_text() {
        return language_text;
    }

    public void setLanguage_text(String language_text) {
        this.language_text = language_text;
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
