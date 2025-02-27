package com.cyberark.model;

import java.util.ArrayList;
import java.util.List;

public class QueryForm {
    private String entity;
    private String join;
    private List<String> columns;
    private String filters;

    public QueryForm()
    {
        this.columns = new ArrayList<>();
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }
}
