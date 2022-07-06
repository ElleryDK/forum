package com.xxx.forum.param;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageParam {
    private int currentPage;
    private int pageSize;
}
