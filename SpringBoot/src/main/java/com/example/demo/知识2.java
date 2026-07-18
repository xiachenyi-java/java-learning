package com.example.demo;

/**
 * 夏辰义
 * 2026/7/1817:23
 */
public class 知识2 {
}
/*
http://localhost:8080/hello
这一整串就是一个 URL。
URL 的标准定义
URL = Uniform Resource Locator
统一资源定位符
通俗说：互联网上每个资源（网页、图片、接口）的"家庭住址"。
就像你寄快递需要写地址一样，浏览器访问服务器也需要一个"地址"，这个地址就是 URL。
  http://   localhost   :8080   /hello
     ↑          ↑        ↑        ↑
   协议      主机地址    端口     路径
   1️⃣ 协议：http:// 或 https://
表格
协议	全称	特点
HTTP	HyperText Transfer Protocol	明文传输，不安全，速度快
HTTPS	HTTP + Secure	加密传输，安全（有 SSL 证书）
你访问百度是 https://www.baidu.com，因为涉及搜索隐私，要用安全的。
如果没有协议：
浏览器不知道"怎么"和服务器说话，就像你寄快递不写"走空运还是陆运"。
2️⃣ 主机：localhost
就是"哪台电脑"。可以是：
localhost → 本机
127.0.0.1 → 本机（IP 形式）
192.168.1.8 → 局域网内某台电脑
www.baidu.com → 百度公司的服务器（域名，背后也是 IP）
3️⃣ 端口：:8080
一台电脑可能同时运行：
8080：你的 Spring Boot 项目
3306：MySQL 数据库
6379：Redis 缓存
端口号告诉浏览器：找这台电脑的哪个程序。
注意：http 默认端口是 80，https 默认是 443。如果是默认端口，URL 里可以省略不写。
http://localhost:80/hello = http://localhost/hello
但 8080 不是默认，所以必须写 :8080
4️⃣ 路径：/hello
具体要访问哪个资源。
在你的代码里：
java
@GetMapping("/hello")   ← 这个 "/hello" 就是 URL 路径
路径可以有多层：
plain
http://localhost:8080/user/login
http://localhost:8080/api/v1/orders/123
🎯 一句话总结
URL = 协议 + 主机 + 端口 + 路径
就像：运输方式 + 收件人 + 房间号 + 具体物品
 */