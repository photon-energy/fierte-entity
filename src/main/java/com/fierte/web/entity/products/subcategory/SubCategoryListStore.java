package com.fierte.web.entity.products.subcategory;

public class SubCategoryListStore {

    private Long subcategory_id;
    private String subcategory_name;
    private Integer category_id;

    public SubCategoryListStore() {}

    public SubCategoryListStore(Long subcategory_id, String subcategory_name, Integer category_id) {
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.category_id = category_id;
    }

    public Long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(Long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
