package com.github.jcbjcb.tools.common.util;

import lombok.Data;

@Data
public class ObjectRestResponse<T> extends BaseResponse {

    private T data;

    public ObjectRestResponse(int status, String message, T data) {
        super(status, message);
        this.data = data;
    }

    public ObjectRestResponse(T data) {
        this.data = data;
    }

    public ObjectRestResponse() {
    }
}
