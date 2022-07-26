package com.fierte.entity.entity.dashboard;

public class PopularCategories {

    private String category_name;
    private Integer sell_amount;

    public PopularCategories(){}

    public PopularCategories(String category_name, Integer sell_amount) {
        this.category_name = category_name;
        this.sell_amount = sell_amount;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getSell_amount() {
        return sell_amount;
    }

    public void setSell_amount(Integer sell_amount) {
        this.sell_amount = sell_amount;
    }
}
