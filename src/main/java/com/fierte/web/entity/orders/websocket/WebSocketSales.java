package com.fierte.web.entity.orders.websocket;

public class WebSocketSales {

    private String language_locale;
    private Integer page;
    private Integer pageSize;
    private String search;
    private Long order_id;

    public WebSocketSales(){}

    public WebSocketSales(String language_locale, Integer page, Integer pageSize, String search, Long order_id) {
        this.language_locale = language_locale;
        this.page = page;
        this.pageSize = pageSize;
        this.search = search;
        this.order_id = order_id;
    }

    public String getLanguage_locale() {
        return language_locale;
    }

    public void setLanguage_locale(String language_locale) {
        this.language_locale = language_locale;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}
