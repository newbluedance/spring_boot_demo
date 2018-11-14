package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 普通类调用Spring bean对象
 * @ComponentScan 默认会扫描这个类所在的文件夹路径下的所有类,其他路径不扫描(如果需要扫描其他路径请加value属性)
 * @author lichunfeng
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(DemoApplication.class);
        springApplication.run(args);
    }

}
