package com.fierte.web.entity.products.websocket;

import com.fierte.web.entity.products.products.ProductParent;

import java.util.List;

public class ResponseProductParent {

    private Integer total;
    private List<ProductParent> data;

    public ResponseProductParent(){}

    public ResponseProductParent(Integer total, List<ProductParent> data){
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<ProductParent> getData() {
        return data;
    }

    public void setData(List<ProductParent> data) {
        this.data = data;
    }
}
