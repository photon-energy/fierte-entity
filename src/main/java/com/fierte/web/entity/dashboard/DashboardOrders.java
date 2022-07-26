package com.fierte.web.entity.dashboard;

public class DashboardOrders {

    private Integer daily_orders;
    private Integer weekly_orders;
    private Integer monthly_orders;
    private Integer pending_orders;

    public DashboardOrders(){}

    public DashboardOrders(Integer daily_orders, Integer weekly_orders, Integer monthly_orders, Integer pending_orders) {
        this.daily_orders = daily_orders;
        this.weekly_orders = weekly_orders;
        this.monthly_orders = monthly_orders;
        this.pending_orders = pending_orders;
    }

    public Integer getDaily_orders() {
        return daily_orders;
    }

    public void setDaily_orders(Integer daily_orders) {
        this.daily_orders = daily_orders;
    }

    public Integer getWeekly_orders() {
        return weekly_orders;
    }

    public void setWeekly_orders(Integer weekly_orders) {
        this.weekly_orders = weekly_orders;
    }

    public Integer getMonthly_orders() {
        return monthly_orders;
    }

    public void setMonthly_orders(Integer monthly_orders) {
        this.monthly_orders = monthly_orders;
    }

    public Integer getPending_orders() {
        return pending_orders;
    }

    public void setPending_orders(Integer pending_orders) {
        this.pending_orders = pending_orders;
    }
}
