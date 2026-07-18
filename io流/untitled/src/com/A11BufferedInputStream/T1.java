package com.A11BufferedInputStream;

import java.io.*;

/**
 * 夏辰义
 * 2026/7/1717:30
 */
//为什么需要缓冲流
//读 1MB 文件 = 访问硬盘 100 多万次，慢到无法接受。
    //| 陷阱                      | 说明                               |
//| ----------------------- | -------------------------------- |
//| 忘记 `newLine()`          | `readLine()` 不返回换行符，写入后内容连成一行    |
//| 忘记 `flush()`/`close()`  | 数据还在缓冲区，文件为空                     |
//| 用 `BufferedReader` 读二进制 | 会损坏数据，二进制用 `BufferedInputStream` |
//| 缓冲区太大                   | 浪费内存，通常 8KB~64KB 足够              |
public class T1 {
    public static void main(String[] args) {
        String src ="D:/test/photo.jpg";
        String dest = "D:/test/photo_copy.jpg";

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
             byte[] buffers = new byte[1024];
             int len;
             while ((len = bis.read(buffers)) != -1){
                 bos.write(buffers,0,len);
             }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/*
import java.io.*;

public class BufferedCharDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:/test/input.txt"));
             BufferedWriter bw = new BufferedWriter(
                new FileWriter("D:/test/output.txt"))) {

            String line;
            // readLine() 一次读一行，返回 null 表示结束
            while ((line = br.readLine()) != null) {
                System.out.println("读到: " + line);

                bw.write(line);       // 写入这一行
                bw.newLine();         // 写入换行符（跨平台！）
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
| 方法                 | 作用                                 |
| ------------------ | ---------------------------------- |
| `br.readLine()`    | 读一行（**不包含换行符**），末尾返回 `null`        |
| `bw.write(String)` | 写字符串                               |
| `bw.newLine()`     | 写入系统换行符（Windows `\r\n`，Linux `\n`） |
| `bw.flush()`       | 刷新缓冲区                              |
缓冲流的本质是包装流：每个流只负责一件事
可以像套娃一样层层包装
关闭最外层，内层自动关闭
 */