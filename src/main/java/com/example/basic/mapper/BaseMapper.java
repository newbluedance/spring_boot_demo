package com.example.basic.mapper;

import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

/**
 * 自定义Mapper
 *
 * @author lichunfeng
 */
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, MySqlMapper<T>, IdsMapper<T>,
    ExampleMapper<T>, RowBoundsMapper<T> {

}
