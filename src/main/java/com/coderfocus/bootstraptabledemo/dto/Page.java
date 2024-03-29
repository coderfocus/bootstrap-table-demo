package com.coderfocus.bootstraptabledemo.dto;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
    private Integer offset;
    private Integer limit;
    private Integer total;
    private List<T> data;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Page(){
        this.setData(new ArrayList<>());
    }
}
