package com.example2.demo2;

/**
 * 夏辰义
 * 2026/8/1213:58
 */
public class 重要知识2 {
}
/*
1. 为什么用 @RestControllerAdvice 而不是 @ControllerAdvice？
@ControllerAdvice：默认返回页面（HTML），适合传统 MVC
@RestControllerAdvice：默认返回JSON，适合前后端分离
如果你用了 @ControllerAdvice，前端会收到 404 或一堆 HTML 标签，而不是 {"code":500...}。
2. ArithmeticException 会被捕获吗？
ArithmeticException（比如 1/0）不是 RuntimeException 吗？
它是！ ArithmeticException 继承自 RuntimeException，所以也会被你的处理器捕获。
但如果是编译时异常（比如 IOException、SQLException），你的 @ExceptionHandler(RuntimeException.class) 抓不到。解决办法
3. 为什么全局异常比 try-catch 好？
不遗漏：100 个接口不用写 100 个 try-catch，不会忘记
统一：错误格式由一个人（GlobalExceptionHandler）管，不会有的返回 JSON、有的返回字符串
干净：Controller 只关心正常流程，代码变短
 */
