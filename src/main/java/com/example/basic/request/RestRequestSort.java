package com.example.basic.request;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 排序字段
 *
 * @author lichunfeng
 *
 */
@Data
@AllArgsConstructor
public class RestRequestSort implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 5255059459988467968L;

    /** 排序字段 */
    private String field;

    /** 排序类型：desc、asc */
    private String type;

    /** 构造方法 */
    public RestRequestSort() {
        super();
    }
}
