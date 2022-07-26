package com.fierte.entity.entity.products.color;

import io.swagger.v3.oas.annotations.media.Schema;

public class Color {

    private Long color_id;
    private LanguageColorName[] language_color_name;
    private String color_code;
    private String color_text;
    private Integer status;
    private String created_time;

    public Color(){}

    public Color(Long color_id, LanguageColorName[] language_color_name, String color_code, String color_text, Integer status, String created_time){
        this.color_id = color_id;
        this.language_color_name = language_color_name;
        this.color_code = color_code;
        this.color_text = color_text;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getColor_id() {
        return color_id;
    }

    @Schema(hidden = true)
    public void setColor_id(Long color_id) {
        this.color_id = color_id;
    }

    public LanguageColorName[] getLanguage_color_name() {
        return language_color_name;
    }

    public void setLanguage_color_name(LanguageColorName[] language_color_name) {
        this.language_color_name = language_color_name;
    }

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }

    public String getColor_text() {
        return color_text;
    }

    public void setColor_text(String color_text) {
        this.color_text = color_text;
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
