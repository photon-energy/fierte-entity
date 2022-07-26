package com.fierte.web.entity.products.websocket;

public class WebSocketRequest {

    private MessageType messageType;
    private String content;
    private String token;
    private String language_locale;

    public WebSocketRequest(){}

    public WebSocketRequest(MessageType messageType, String content, String token, String language_locale){
        this.messageType = messageType;
        this.content = content;
        this.token = token;
        this.language_locale = language_locale;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public enum MessageType {
        JOIN,CHAT, LEAVE
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLanguage_locale() {
        return language_locale;
    }

    public void setLanguage_locale(String language_locale) {
        this.language_locale = language_locale;
    }
}
