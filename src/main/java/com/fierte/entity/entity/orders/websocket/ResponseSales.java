package com.fierte.entity.entity.orders.websocket;

import com.fierte.entity.entity.orders.Orders;

import java.util.List;

public class ResponseSales {

    private Integer total;
    private List<Orders> data;


    public ResponseSales(){}

    public ResponseSales(Integer total, List<Orders> data) {
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Orders> getData() {
        return data;
    }

    public void setData(List<Orders> data) {
        this.data = data;
    }
}
