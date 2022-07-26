package com.fierte.web.entity.products.websocket;

import com.fierte.web.entity.products.products.InventoryItems;

import java.util.List;

public class ResponseInventoryItems {

    private Integer total;
    private List<InventoryItems> data;

    public ResponseInventoryItems(){}

    public ResponseInventoryItems(Integer total, List<InventoryItems> data){
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<InventoryItems> getData() {
        return data;
    }

    public void setData(List<InventoryItems> data) {
        this.data = data;
    }
}
