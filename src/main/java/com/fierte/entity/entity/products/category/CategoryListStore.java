package com.fierte.entity.entity.products.category;

public class CategoryListStore {

    private Long category_id;
    private String category_name;
    private String[] photo;

    public CategoryListStore(){}

    public CategoryListStore(Long category_id, String category_name, String[] photo) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.photo = photo;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }
}
