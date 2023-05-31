package com.katalon.jenkins.plugin.search;

import java.util.List;

public class SearchParameter {
    private String type;

    private List<SearchCondition> conditions;

    private SearchPagination pagination;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SearchCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<SearchCondition> conditions) {
        this.conditions = conditions;
    }

    public SearchPagination getPagination() {
        return pagination;
    }

    public void setPagination(SearchPagination pagination) {
        this.pagination = pagination;
    }
}
