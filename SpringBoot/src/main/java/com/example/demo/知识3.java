package com.example.demo;

/**
 * 夏辰义
 * 2026/7/1916:15
 */
public class 知识3 {
}
/*
依赖 = "项目需要的外部工具包依赖有"传递性"：
1️⃣ <parent> = "版本管家"
spring-boot-starter-parent 是 Spring Boot 的父 POM，它帮你做了两件事：
功能	说明
统一版本管理	它内部定义了 100+ 个常用依赖的版本号（Tomcat、Spring MVC、Jackson JSON 等）
插件配置	预配置好了 Maven 编译插件、打包插件
2️⃣ spring-boot-starter-webmvc = "一键 Web 开发包"
"starter" 是 Spring Boot 的发明，意思是： starter = 一组相关依赖的打包。
spring-boot-starter-webmvc 内部包含了：
Spring MVC（处理 HTTP 请求）
内嵌 Tomcat（Web 服务器）
Jackson（JSON 处理）
Hibernate Validator（参数校验）
等等...
你只需要写一行 <dependency>，Maven 自动帮你下载 20+ 个 jar 包。
<build>	打包插件，让 jar 包可以直接运行
 */
/*
server.port=80,改端口名
properties 优先级高
server:
 port:80
yml 中
server:
 port:80
yaml 低
yml是主流
 */