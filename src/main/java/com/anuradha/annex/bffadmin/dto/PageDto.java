package com.anuradha.annex.bffadmin.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PageDto<T> {

    private List<T> content;
    private SortInfo sort;
    private boolean last;
    private int totalPages;
    private int totalElements;
    private boolean first;
    private int size;
    private int number;
    private SortInfo innerSort;
    private int numberOfElements;
    private boolean empty;

    @Getter
    @Setter
    @ToString
    static class SortInfo {
        private boolean sorted;
        private boolean empty;
        private boolean unsorted;
    }


}
