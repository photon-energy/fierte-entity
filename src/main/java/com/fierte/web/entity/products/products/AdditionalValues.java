package com.fierte.web.entity.products.products;

public class AdditionalValues {

    private String key;
    private String value;

    public AdditionalValues(){}

    public AdditionalValues(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
