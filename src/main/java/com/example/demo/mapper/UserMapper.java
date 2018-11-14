package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * 
 *
 * @author lichunfeng
 * @date 2018-11-12 05:01:50
 */
@Mapper
public interface UserMapper  extends BaseMapper<User> {

}