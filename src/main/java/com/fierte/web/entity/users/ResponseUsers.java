package com.fierte.web.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ResponseUsers {

    private boolean success;
    private String message;
    private Integer total;
    private List<UsersList> data;

}
