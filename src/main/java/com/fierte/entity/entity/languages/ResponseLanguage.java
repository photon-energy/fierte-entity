package com.fierte.entity.entity.languages;

import java.util.List;

public class ResponseLanguage {

    private Integer total;
    private List<Language> data;

    public ResponseLanguage(){}

    public ResponseLanguage(Integer total, List<Language> data){
        this.total = total;
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Language> getData() {
        return data;
    }

    public void setData(List<Language> data) {
        this.data = data;
    }
}
