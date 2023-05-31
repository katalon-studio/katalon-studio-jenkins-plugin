package com.katalon.jenkins.plugin.search;

import java.util.List;

public class SearchPagination {
    private Long page;

    private Long size;

    private List<String> sorts;

    public SearchPagination(Long page, Long size, List<String> sorts) {
        this.page = page;
        this.size = size;
        this.sorts = sorts;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public List<String> getSorts() {
        return sorts;
    }

    public void setSorts(List<String> sorts) {
        this.sorts = sorts;
    }
}
