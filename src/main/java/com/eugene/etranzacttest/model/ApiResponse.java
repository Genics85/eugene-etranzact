package com.eugene.etranzacttest.model;

import lombok.Data;

import java.util.Optional;

@Data
public class ApiResponse<T> {
    Optional<T> data;
    String code;
    String entity;
    String path;

    public ApiResponse(Optional<T> data, String code, String entity, String path) {
        this.data = data;
        this.code = code;
        this.entity = entity;
        this.path = path;
    }
}
