package com.jcbjcb.tools.common.util;

import lombok.Data;

@Data
public abstract class BaseResponse {
    private int status = 200;
    private String message;


    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse() {
    }
}
