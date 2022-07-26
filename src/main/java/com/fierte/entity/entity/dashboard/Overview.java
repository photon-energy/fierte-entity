package com.fierte.entity.entity.dashboard;

public class Overview {

    private String date;
    private VisitsAndOrders visits_orders;

    public Overview(){}

    public Overview(String date, VisitsAndOrders visits_orders) {
        this.date = date;
        this.visits_orders = visits_orders;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VisitsAndOrders getVisits_orders() {
        return visits_orders;
    }

    public void setVisits_orders(VisitsAndOrders visits_orders) {
        this.visits_orders = visits_orders;
    }
}
