package com.fierte.web.entity.response;



import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ResponsePagination<T> {

    private boolean success;
    private String message;
    private Integer total;
    private List<T> data;
}
