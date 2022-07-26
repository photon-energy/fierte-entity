package com.fierte.web.entity.products.category;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CategoryList {

    private Long category_id;
    private String category_name;
    private String description;
    private String[] photo;
    private Integer status;
    private String created_time;



}
