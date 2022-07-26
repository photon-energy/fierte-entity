package com.fierte.web.entity.products.websocket;

import com.fierte.web.entity.products.products.InventoryParent;

import java.util.List;

public class ResponseInventoryParent {

    private Integer total;
    private List<InventoryParent> data;

    public ResponseInventoryParent(){}

    public ResponseInventoryParent(Integer total, List<InventoryParent> data){
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<InventoryParent> getData() {
        return data;
    }

    public void setData(List<InventoryParent> data) {
        this.data = data;
    }
}
