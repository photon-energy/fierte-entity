package com.fierte.entity.entity.dashboard;

public class VisitsAndOrders {

    private Integer visits;
    private Integer orders;

    public VisitsAndOrders(){}

    public VisitsAndOrders(Integer visits, Integer orders) {
        this.visits = visits;
        this.orders = orders;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}
