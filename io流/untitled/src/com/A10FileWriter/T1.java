package com.A10FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 夏辰义
 * 2026/7/1617:30
 */
public class T1 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:/test/out.txt");
            fw.write("Hello, 世界！");  // 直接写字符串！
            fw.write("\n");              // 换行
            fw.write("第二行内容");      // 再写一行
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fw != null) {
                try {
                    fw.close();  // 关闭流，强制刷新缓冲区到硬盘
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
}
/*
没有真正写入文件是因为流没有关闭
 */
/*
特性	字节流	字符流
单位	byte（8位）	char（16位）
适合	图片、视频、二进制文件	文本文件（.txt .java .html）
中文处理	手动指定编码，容易乱码	自动处理，不乱码
读取	byte[]	char[] / String
写入	先 getBytes()	直接写 String
缓冲	BufferedInputStream	BufferedReader（下节课）
文本文件 → 用字符流（FileReader / FileWriter）
二进制文件 → 用字节流（FileInputStream / FileOutputStream）
 */