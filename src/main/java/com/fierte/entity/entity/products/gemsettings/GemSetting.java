package com.fierte.entity.entity.products.gemsettings;

import io.swagger.v3.oas.annotations.media.Schema;

public class GemSetting {

    private Long gemsetting_id;
    private LanguageGemSettingName[] language_gemsetting_name;
    private Integer status;
    private String created_time;


    public GemSetting(){}

    public GemSetting(Long gemsetting_id, LanguageGemSettingName[] language_gemsetting_name, Integer status, String created_time){
        this.gemsetting_id = gemsetting_id;
        this.language_gemsetting_name = language_gemsetting_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getGemsetting_id() {
        return gemsetting_id;
    }


    @Schema(hidden = true)
    public void setGemsetting_id(Long gemsetting_id) {
        this.gemsetting_id = gemsetting_id;
    }

    public LanguageGemSettingName[] getLanguage_gemsetting_name() {
        return language_gemsetting_name;
    }

    public void setLanguage_gemsetting_name(LanguageGemSettingName[] language_gemsetting_name) {
        this.language_gemsetting_name = language_gemsetting_name;
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
