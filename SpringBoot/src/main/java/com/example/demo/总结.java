package com.example.demo;

/**
 * 夏辰义
 * 2026/7/2017:29
 */
public class 总结 {
}
/*
一、Spring Boot 是什么？（一句话）
Spring Boot = 简化配置的 Spring 框架 + 内嵌 Tomcat + 自动依赖管理。
以前写 Web 项目要配 XML、装 Tomcat、导几十个 jar 包。现在一个 pom.xml + 一个主类就能跑。
二、项目创建（你走过的完整路径）
表格
步骤	关键点	你的实践
1. 选版本	Spring Boot 4.1.0 + JDK 23 + Java 21	✅ 用了最新版
2. 官网生成	start.spring.io → Maven → 选 Spring Web	✅ 绕过 Community 版限制
3. IDEA 打开	File → Open 解压后的文件夹	✅
4. Maven 加载	配阿里云镜像解决下载慢	✅
5. 运行验证	看到 Started DemoApplication + Tomcat 8080	✅
三、核心注解（第一梯队，必须背熟）
注解	作用	记忆口诀
@SpringBootApplication	自动配置 + 组件扫描的总开关	"一键启动"
@RestController	声明这个类接收 HTTP 请求，返回 JSON/字符串	"我是接口"
@GetMapping("/xxx")	把 URL 路径绑定到方法上	"地址门牌号"
@Value("${key}")	从配置文件里读值注入到字段	"读配置"
@Autowired	让 Spring 自动创建对象并注入	"找对象"
@Service	声明业务层组件，交给 Spring 管理	"我是业务"
四、配置文件体系（你踩坑最多的地方）
1. 三种格式
application.properties = 键值对（server.port=8081）
application.yml / application.yaml = 层级缩进（推荐）
优先级：properties > yml > yaml
建议：只留一个 application.yml
server:
  port: 8081        # ✅ 冒号后有空格，用空格缩进
enterprise:
  name: 葫芦娃      # ✅ 和 server 同级
  subject:          # ✅ 列表
    - Java          # ✅ 短横线后有空格
    src/main/java/com/example/demo/
├── DemoApplication.java      # 入口，@SpringBootApplication
├── Controller.java           # 控制层，@RestController + @GetMapping
└── BookService.java          # 业务层，@Service

src/main/resources/
└── application.yml           # 配置文件
七、Maven 核心概念
概念	作用
<parent>	版本管家，统一管理依赖版本
<dependencies>	购物清单，声明项目需要什么
starter	一键引入一组依赖（如 spring-boot-starter-webmvc）
mvn package	打包成可执行 jar
 */