package com.example.demo.controller;

import com.example.basic.request.RestRequest;
import com.example.basic.response.RestResponse;
import com.example.basic.utils.spring.SpringContextUtils;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichunfeng
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @Autowired
    private Environment environment;

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping("/byName")
    @ResponseBody
    public List<User> getListByName(@RequestBody User user) {

        return userMapper.selectAll();
    }
    @PostMapping("/byPage")
    @ResponseBody
    public RestResponse<PageInfo<User>> getListByPage(@RequestBody RestRequest<User> request) {
        PageInfo<User> pageInfo =PageHelper.startPage(1, 10).doSelectPageInfo(()->userMapper.selectAll());

        return RestResponse.success(pageInfo);
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getEnvironment")
    public String getEnvironment() {
        return SpringContextUtils.getBean(Environment.class).toString();
    }

}

