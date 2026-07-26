//package com;

/**
 * 夏辰义
 * 2026/7/2615:45
 */
public class 其他流 {
}
/*
三、打印流 PrintStream / PrintWriter
特点：
永远不会抛 IOException（吞掉了，用 checkError() 检查）
提供 print()、println()、printf() 等便捷方法
System.out 就是 PrintStream
四、内存流 ByteArrayInputStream / ByteArrayOutputStream
特点：数据源不是文件/网络，而是内存中的字节数组。
五、随机访问流 RandomAccessFile
特点：
既能读也能写（不是继承 InputStream/OutputStream）
支持 seek() 跳转到任意位置
适合大文件局部修改、断点续传
六、管道流（了解即可）
 */