package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 夏辰义
 * 2026/7/2015:38
 */
@RestController
public class Controller2 {
    @Value("${企业.name}")
    //@Value = 从 Spring 的"环境配置"中读取指定 key 的值，注入到字段中。
    private String name;
    @GetMapping("/test")
    public String test() {
        return "企业名称：" + name;
    }
}
/*
2️⃣ 完整语法
表格
写法	含义	示例
@Value("${key}")	读取配置文件中 key 的值	@Value("${server.port}") → 8081
@Value("${key:默认值}")	如果配置里没有这个 key，用默认值	@Value("${enterprise.boss:张三}")
@Value("纯字符串")	直接赋值（不加 ${}）	@Value("hello") → 永远是 "hello"
@Value("${key1}, ${key2}")	拼接多个值	@Value("${a}, ${b}")
 */