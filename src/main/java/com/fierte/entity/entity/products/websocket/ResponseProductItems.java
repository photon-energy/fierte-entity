package com.fierte.entity.entity.products.websocket;

import com.fierte.entity.entity.products.products.ProductItemsWebSocket;

import java.util.List;

public class ResponseProductItems {

    private Integer total;
    private List<ProductItemsWebSocket> data;

    public ResponseProductItems(){}

    public ResponseProductItems(Integer total, List<ProductItemsWebSocket> data){
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<ProductItemsWebSocket> getData() {
        return data;
    }

    public void setData(List<ProductItemsWebSocket> data) {
        this.data = data;
    }
}
