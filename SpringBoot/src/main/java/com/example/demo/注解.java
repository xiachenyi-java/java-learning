package com.example.demo;

/**
 * 夏辰义
 * 2026/7/2017:29
 */
public class 注解 {
}
/*
🔴 第一梯队：现在就必须滚瓜烂熟
 注解	作用	放在哪	你用过吗？
@SpringBootApplication	开启自动配置 + 组件扫描	主启动类	✅
@RestController	声明这是一个 REST 接口类，返回 JSON/字符串	Controller 类	✅
@GetMapping	处理 GET 请求，绑定 URL 路径	方法上	✅
@PostMapping	处理 POST 请求（登录、提交表单）	方法上	❌ 待学
@RequestParam	接收 URL 参数 ?name=张三	方法参数上	❌ 待学
@Value	读取配置文件里的值	字段上	✅
@Autowired	自动注入 Spring 管理的对象	字段/构造器/Setter	✅
@Service	声明业务层组件，交给 Spring 管理	业务类上	✅
@Component	通用组件注解（不知道归哪类就用它）	任意类上
 */
/*
注解	作用	场景
@RequestBody	接收 JSON 格式的请求体	前端传 JSON 数据给后端
@PathVariable	接收 URL 路径参数 /user/123	RESTful 风格接口
@ConfigurationProperties	批量读取配置到对象	配置项很多时（如数据库连接池配置）
@Mapper	MyBatis 的 Mapper 接口	数据库操作层
@Select / @Insert / @Update / @Delete	MyBatis 写 SQL	数据库增删改查
@Transactional	声明事务	下单、转账等需要原子操作的场景
@Cacheable	开启缓存	查询菜品时缓存结果
@Scheduled	定时任务	自动处理超时订单
 */
/*
@Configuration	声明配置类	学原理时
@Bean	手动创建对象交给 Spring	学原理时
@Aspect / @Before / @After	AOP 切面编程	学日志/权限时
@ExceptionHandler	全局异常处理	做项目优化时
@CrossOrigin	解决跨域问题	前后端联调时
 */
/*
三个新注解（简单解释）
表格
注解	作用	例子
@PathVariable	从 URL 路径里取参数	/books/1 → 拿到 id=1
@RequestBody	从请求体里取 JSON 数据	前端传 {"name":"西游记"} → 变成 Book 对象
@PostMapping	处理 POST 请求	用于添加、提交
 */
