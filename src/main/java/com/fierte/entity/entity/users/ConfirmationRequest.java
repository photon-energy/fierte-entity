package com.fierte.entity.entity.users;

public class ConfirmationRequest {

    private Messages[] messages;

    public ConfirmationRequest(){}

    public ConfirmationRequest(Messages[] messages){
        this.messages = messages;
    }

    public Messages[] getMessages() {
        return messages;
    }

    public void setMessages(Messages[] messages) {
        this.messages = messages;
    }
}



