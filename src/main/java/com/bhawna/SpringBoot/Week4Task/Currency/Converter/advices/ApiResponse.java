package com.bhawna.SpringBoot.Week4Task.Currency.Converter.advices;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T>{

    private T data;
    private ApiError error;

//    @JsonFormat(pattern = "hh:mm:ss dd-MM-yyyy")
    private LocalDateTime timeStamp;

    public ApiResponse(T data) {
        this();
        this.data = data;
    }

    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }

    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }
}
