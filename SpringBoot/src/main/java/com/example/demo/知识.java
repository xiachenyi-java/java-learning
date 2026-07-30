package com.example.demo;

/**
 * 夏辰义
 * 2026/7/1817:05
 */
public class 知识 {
}
/*
1️⃣ localhost = "本机地址"
地址	含义	谁能访问
localhost	你自己的电脑	只有你自己
127.0.0.1	也是本机地址（数字版 localhost）	只有你自己
192.168.x.x	你电脑的局域网 IP	同一个 WiFi 下的人
公网 IP	互联网上的地址	全世界
所以：
http://localhost:8080/hello → 只有你的电脑能打开
你同桌输入这个地址 → 打不开（因为他访问的是他自己的 localhost，不是 yours）
类比：localhost 就像你对自己说"我自己"。你同桌说"我自己"的时候，指的是他自己，不是你。
如果你想让同桌访问你的项目：
查你的局域网 IP：Win + R → cmd → ipconfig，找 IPv4 地址（比如 192.168.1.8）
同桌访问：http://192.168.1.8:8080/hello
但前提是你电脑防火墙要允许
2️⃣ 8080 = 端口号
一台电脑可以同时运行很多程序，端口号就是用来区分不同程序的"门牌号"。
表格
端口号	默认用途
80	HTTP 网页（浏览器默认，所以访问百度不用写 :80）
443	HTTPS 安全网页
8080	开发测试常用（Spring Boot 默认）
3306	MySQL 数据库
6379	Redis 缓存
Spring Boot 默认用 8080，就像你家默认门牌号是 8080 号。
如果你想改端口号：
打开 application.properties，加一行：
properties
server.port=9999
然后访问 http://localhost:9999/hello
类比：端口号就像一栋大楼的房间号。8080 房间是 Tomcat 在办公，3306 房间是 MySQL 在办公。
html 是什么？
.html 是网页文件的扩展名，里面写的是 HTML 标签（超文本标记语言）。
比如一个 index.html：
HTML
<!DOCTYPE html>
<html>
<head><title>首页</title></head>
<body>
    <h1>欢迎来到我的网站</h1>
    <p>这是一段文字</p>
</body>
</html>
浏览器看到 .html 就会把它渲染成漂亮的网页。
那为什么你的 Spring Boot 返回的是纯文字，不是 .html？
因为 @RestController 的 Rest = REpresentational State Transfer（RESTful 风格），意思是：
"我只返回数据（字符串、JSON），不返回页面。"
如果你要返回 HTML 页面：
不能用 @RestController
要用 @Controller
方法返回 "index"，Spring 会去 templates 文件夹找 index.html
 */