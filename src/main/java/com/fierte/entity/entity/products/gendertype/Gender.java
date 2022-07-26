package com.fierte.entity.entity.products.gendertype;

import io.swagger.v3.oas.annotations.media.Schema;

public class Gender {

    private Long gender_id;
    private LanguageGenderName[] language_gender_name;
    private Integer status;
    private String created_time;

    public Gender(){}

    public Gender(Long gender_id, LanguageGenderName[] language_gender_name, Integer status, String created_time){
        this.gender_id = gender_id;
        this.language_gender_name = language_gender_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getGender_id() {
        return gender_id;
    }

    @Schema(hidden = true)
    public void setGender_id(Long gender_id) {
        this.gender_id = gender_id;
    }

    public LanguageGenderName[] getLanguage_gender_name() {
        return language_gender_name;
    }

    public void setLanguage_gender_name(LanguageGenderName[] language_gender_name) {
        this.language_gender_name = language_gender_name;
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
