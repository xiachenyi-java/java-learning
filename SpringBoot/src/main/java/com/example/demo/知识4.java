package com.example.demo;

/**
 * 夏辰义
 * 2026/7/1922:56
 */
public class 知识4 {
}
/*
结论：自定义配置本来就没有自动提示，这是正常的，不是 bug！
作用完全一样，只是写法不同。
properties = 键值对，适合简单配置。
yml/yaml = 层级缩进，适合复杂配置。
不要三个同时存在，选一个就行！
1️⃣ 共同点
表格
特性	说明
存放位置	必须放在 src/main/resources
文件名	必须叫 application（Spring Boot 自动加载）
作用	配置项目参数（端口、数据库、日志、缓存等）
格式	都是纯文本，IDEA 有语法高亮
2️⃣ 格式区别（核心！）
📄 application.properties —— 键值对格式
key=value 形式
层级用 点号 . 分隔
简单直观，但配置多了容易看花眼
application.yml / application.yaml —— YAML 格式
用缩进表示层级（和 Python 一样）
结构清晰，一眼能看出父子关系
适合配置项多的项目（如苍穹外卖）
💡 .yml 和 .yaml 的区别：完全没有区别！
YAML 的全称是 "YAML Ain't Markup Language"，
.yml 是早期 DOS 系统只支持 3 个字母扩展名时的写法，
.yaml 是标准写法。Spring Boot 两者都支持，内容格式一模一样。
*/