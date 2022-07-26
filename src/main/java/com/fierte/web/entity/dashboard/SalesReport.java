package com.fierte.web.entity.dashboard;

public class SalesReport {

    private String date;
    private Integer sell_amount;

    public SalesReport(){}

    public SalesReport(String date, Integer sell_amount) {
        this.date = date;
        this.sell_amount = sell_amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSell_amount() {
        return sell_amount;
    }

    public void setSell_amount(Integer sell_amount) {
        this.sell_amount = sell_amount;
    }
}
