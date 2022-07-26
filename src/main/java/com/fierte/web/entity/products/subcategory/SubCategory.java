package com.fierte.web.entity.products.subcategory;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class SubCategory {

    private Long subcategory_id;
    private LanguageSubCategoryName[] language_subcategory_name;
    private com.fierte.web.entity.products.category.LanguageDescription[] language_description;
    private Integer category_id;
    private String category_name;

    private String hash_name;
    private Integer status;
    private String created_time;



}
