package com.fierte.web.entity.products.websocket;

public class SocketSession {

    private Long socket_session_id;
    private String session;
    private Integer page;
    private Integer pagesize;
    private String created_time;

    public SocketSession(){}


    public SocketSession(Long socket_session_id, String session, Integer page, Integer pagesize, String created_time){
        this.socket_session_id = socket_session_id;
        this.session = session;
        this.page = page;
        this.pagesize = pagesize;
        this.created_time = created_time;
    }

    public Long getSocket_session_id() {
        return socket_session_id;
    }

    public void setSocket_session_id(Long socket_session_id) {
        this.socket_session_id = socket_session_id;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

}
