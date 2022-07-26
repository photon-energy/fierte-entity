package com.fierte.web.entity.products.products;

public class LanguageProductName {

    private Long language_id;
    private String product_name;

    public LanguageProductName(){}

    public LanguageProductName(Long language_id, String product_name){
        this.language_id = language_id;
        this.product_name = product_name;
    }

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
