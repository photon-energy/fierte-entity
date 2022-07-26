package com.fierte.web.entity.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
public class Token {

    private String access_token;
    private Integer expires_in;
    private Integer refresh_expires_in;
    private String refresh_token;
    private String token_type;
    @JsonProperty("not-before-policy")
    private Integer not_before_policy;
    private String session_state;
    private String scope;


}
