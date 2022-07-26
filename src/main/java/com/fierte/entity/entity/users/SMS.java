package com.fierte.entity.entity.users;

public class SMS {

    private String originator;
    private Content content;

    public SMS(){}

    public SMS(String originator, Content content){
        this.originator = originator;
        this.content = content;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
