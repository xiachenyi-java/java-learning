package com.A8FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 夏辰义
 * 2026/7/1616:18
 */
public class T1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/test/out.txt");
            String text = "夏辰义真帅";
            byte[] bytes = text.getBytes();// 字符串 → 字节数组
            fos.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/*
| 要点                      | 说明                              |
| ----------------------- | ------------------------------- |
| `try-with-resources`    | 自动关闭流，不用写 `finally { close() }` |
| 缓冲区大小                   | 通常 1024 或 8192，太小效率低，太大占内存      |
| `read(byte[])` 返回值      | 实际读取的字节数，-1 表示结束                |
| `write(byte[], 0, len)` | 必须写 `0, len`，否则可能写入脏数据          |
| 字节流适合                   | 图片、视频、音频、可执行文件等**二进制文件**        |
| 字节流不适合                  | 中文文本（容易乱码，下节课字符流解决）             |

 */
/*
怎么一次写字符串
还是数组
源代码：
  try {
            FileOutputStream fos = new FileOutputStream("D:/test/out.txt");
            fos.write(65);//这是A编码是65
            fos.write('中');//这是字符中但是会有乱码
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
 */
/*
// 覆盖模式（默认）：文件内容会被清空
FileOutputStream fos = new FileOutputStream("D:/test/out.txt");

// 追加模式：在文件末尾追加内容
FileOutputStream fos = new FileOutputStream("D:/test/out.txt", true);

new FileOutputStream(file)	覆盖，原有内容丢失
new FileOutputStream(file, true)	追加，保留原有内容
 */
/*
// ❌ 错误1：忘记用 try-with-resources，流没关闭
FileInputStream fis = new FileInputStream("a.txt");
// ... 用完没 close，资源泄漏！

// ❌ 错误2：write 时不指定长度
fos.write(buffer);  // 如果最后一次只读了 100 字节，会写入 924 个垃圾字节
fos.write(buffer, 0, len);  // ✅ 正确

// ❌ 错误3：用字节流读中文文本
byte[] b = "中文".getBytes();  // UTF-8 下是6个字节
fis.read();  // 一次读1个字节，把"中"拆成两半，乱码！
 */