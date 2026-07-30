package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 夏辰义
 * 2026/7/1816:22
 */
@RestController
//"这个类里的方法，都是用来接收浏览器请求的，而且返回的数据直接给浏览器看（不是跳转页面）。"
public class Controller {
    private int i = 0;
    @GetMapping("/hello")
    //"当浏览器用 GET 方式访问 /hello 时，执行下面的 hello() 方法。"
    //@PostMapping
    //如果你写成 @PostMapping("/hello")，浏览器地址栏访问会报 405 Method Not Allowed（方法不允许）
    // ，因为浏览器地址栏发的是 GET，而你的接口只接受 POST。
    //GET = 去服务器"拿"东西，数据放在 URL 里，适合查询。
    //POST = 给服务器"送"东西，数据放在请求体里，适合提交。
    public String hello(){
        i++;
        System.out.println(i);
        return "Hello, Spring Boot!";
    }
}
/*
@RestController 让 Spring 认识这个类。
@GetMapping("/hello") 让浏览器能找到这个方法。
return 的内容直接显示在浏览器上
 */
/*
注解	作用
@Controller	告诉 Spring："这个类是用来处理 Web 请求的"
@ResponseBody	告诉 Spring："方法返回的字符串直接写给浏览器，不要去找页面模板"
如果没有这个注解：
Spring Boot 启动时不会扫描这个类
浏览器访问 /hello 会报 404（找不到）
类比：@RestController 就像你给这个类发了一张"工作证"，Spring Boot 看到工作证才知道"哦，你是干活的，有人找你处理请求"。
部分	含义
@GetMapping	只处理 GET 请求（浏览器地址栏输入、点击链接、表单默认提交都是 GET）
"/hello"	URL 路径
 */
/*
GET	获取	从服务器读取数据	打开网页、查看商品列表、搜索
POST	提交	向服务器提交数据	登录、注册、提交表单、下单
GET 请求的特点
1. 数据放在 URL 里（肉眼可见）
http://localhost:8080/hello?name=张三&age=20
? 后面就是 GET 请求的参数，任何人都能看到。
2. 有长度限制
URL 太长会被浏览器截断，所以 GET 不适合传大文件。
3. 可以被收藏、分享
因为参数都在 URL 里，你把链接发给别人，别人打开看到的内容和你一样。
4. 幂等性（做多少次结果一样）
你刷新 100 次 http://localhost:8080/hello，结果都是 Hello, Spring Boot!，不会把服务器搞坏。
POST 请求的特点（对比）
1. 数据放在请求体里（URL 上看不到）
POST http://localhost:8080/login
请求体（Body）：{"username":"admin","password":"123456"}
2. 没有长度限制
可以传图片、文件、大量 JSON 数据。
3. 不能被收藏
因为参数不在 URL 里，你把链接发给别人，别人打开没有你的数据。
4. 不是幂等的
你点两次"提交订单"，可能会生成两个订单。
为什么用 @GetMapping 而不是 @PostMapping？
因为：
浏览器地址栏输入 → 默认就是 GET 请求
你只是返回一个字符串 → 只是"获取"数据，没有提交任何东西

 */