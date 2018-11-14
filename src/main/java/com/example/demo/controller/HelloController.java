package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichunfeng
 * @date 2018/11/13 9:13
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "hello world";
    }
}
