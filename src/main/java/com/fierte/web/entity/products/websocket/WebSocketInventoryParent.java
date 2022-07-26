package com.fierte.web.entity.products.websocket;

public class WebSocketInventoryParent {

    private Integer page;
    private Integer pageSize;
    private String search;
    private Long category_id;
    private Long subcategory_id;
    private Integer status;

    public WebSocketInventoryParent(){}

    public WebSocketInventoryParent(Integer page, Integer pageSize, String search, Long category_id,
                                  Long subcategory_id, Integer status){
        this.page = page;
        this.pageSize = pageSize;
        this.search = search;
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.status = status;
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

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(Long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
