package com.fierte.web.entity.users;

public class Content {

    private String text;

    public Content(){}

    public Content(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}