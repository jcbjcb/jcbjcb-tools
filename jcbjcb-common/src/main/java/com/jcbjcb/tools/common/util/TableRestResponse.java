package com.jcbjcb.tools.common.util;

import lombok.Data;

import java.util.List;


@Data
public class TableRestResponse<T> extends BaseResponse {

    private int pageNum = 1;

    private  int pageSize;

    private long total;

    List<T> ListData;

    public TableRestResponse() {
        super();
    }
    public TableRestResponse(List<T> list) {
        this.ListData = list;
    }

    public TableRestResponse(int status, String message, int pageNum, int pageSize, long total,List<T> list) {
        super(status, message);
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.ListData = list;
    }

    public TableRestResponse(int pageNum, int pageSize, int total) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
    }

}
