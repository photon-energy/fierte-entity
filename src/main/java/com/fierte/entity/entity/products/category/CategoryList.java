package com.fierte.entity.entity.products.category;

import io.swagger.v3.oas.annotations.media.Schema;

public class CategoryList {

    private Long category_id;
    private String category_name;
    private String description;
    private String[] photo;
    private Integer status;
    private String created_time;

    public CategoryList(){}

    public CategoryList(Long category_id, String category_name, String description, String[] photo, Integer status, String created_time) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.description = description;
        this.photo = photo;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getCategory_id(){
        return this.category_id;
    }

    @Schema(hidden = true)
    public void setCategory_id(Long category_id){
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status){
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
