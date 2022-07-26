package com.fierte.web.entity.products.products;

public class PriceInterval {

    private Integer start;
    private Integer end;

    public PriceInterval(){}

    public PriceInterval(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
