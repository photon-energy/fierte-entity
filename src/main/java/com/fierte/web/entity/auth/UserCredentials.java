package com.fierte.web.entity.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserCredentials {

    private String type;
    private String value;
    private boolean temporary;

}
