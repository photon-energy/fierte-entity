package com.fierte.entity.entity.products.composition;

import io.swagger.v3.oas.annotations.media.Schema;

public class Composition {

    private Long composition_id;
    private LanguageCompositionName[] language_composition_name;
    private Integer status;
    private String created_time;

    public Composition(){}

    public Composition(Long composition_id, LanguageCompositionName[] language_composition_name, Integer status, String created_time){
        this.composition_id = composition_id;
        this.language_composition_name = language_composition_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getComposition_id() {
        return composition_id;
    }

    @Schema(hidden = true)
    public void setComposition_id(Long composition_id) {
        this.composition_id = composition_id;
    }

    public LanguageCompositionName[] getLanguage_composition_name() {
        return language_composition_name;
    }

    public void setLanguage_composition_name(LanguageCompositionName[] language_composition_name) {
        this.language_composition_name = language_composition_name;
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
