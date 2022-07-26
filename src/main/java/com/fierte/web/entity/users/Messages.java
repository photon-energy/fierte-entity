package com.fierte.web.entity.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Messages {

    private String recipient;
    @JsonProperty("message-id")
    private String message_id;
    private SMS sms;


}
