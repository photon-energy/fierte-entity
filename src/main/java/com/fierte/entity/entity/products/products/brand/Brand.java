package com.fierte.entity.entity.products.products.brand;


import io.swagger.v3.oas.annotations.media.Schema;

public class Brand {

    private Long brand_id;
    private String title;
    private String description;
    private String[] photo;
    private Integer status;
    private String created_time;

    public Brand(){}

    public Brand(Long brand_id, String title, String description, String[] photo, Integer status, String created_time) {
        this.brand_id = brand_id;
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getBrand_id() {
        return brand_id;
    }

    @Schema(hidden = true)
    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
