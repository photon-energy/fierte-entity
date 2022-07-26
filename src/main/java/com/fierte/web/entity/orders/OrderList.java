package com.fierte.web.entity.orders;

import java.util.List;

public class OrderList {

    private List<Orders> current_orders;
    private List<Orders> orders_history;
    private Integer total;

    public OrderList(){}

    public OrderList(List<Orders> current_orders, List<Orders> orders_history, Integer total) {
        this.current_orders = current_orders;
        this.orders_history = orders_history;
        this.total = total;
    }

    public List<Orders> getCurrent_orders() {
        return current_orders;
    }

    public void setCurrent_orders(List<Orders> current_orders) {
        this.current_orders = current_orders;
    }

    public List<Orders> getOrders_history() {
        return orders_history;
    }

    public void setOrders_history(List<Orders> orders_history) {
        this.orders_history = orders_history;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
