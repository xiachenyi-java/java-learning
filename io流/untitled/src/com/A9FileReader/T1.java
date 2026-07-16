package com.A9FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 夏辰义
 * 2026/7/1617:24
 */
//字节流读中文：麻烦，还要指定编码
public class T1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/test/demo.txt");
            int a;// 读取到的是 char（0~65535），-1 表示结束

            while ((a = fr.read()) != -1){
                System.out.print((char) a);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/*
程序 ←—— FileReader —— 文件（自动解码：字节 → 字符）读取
程序 —— FileWriter ——→ 文件（自动编码：字符 → 字节）输入
字节流 read()：读 1 个 byte（8位），中文会截断乱码
字符流 read()：读 1 个 char（16位），中文完整读取
想要批量读取就用字符数组
try (FileReader fr = new FileReader("D:/test/demo.txt")) {

            char[] buffer = new char[1024];  // 字符数组！不是 byte[]
            int len;

            while ((len = fr.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);  // 直接转 String，不用指定编码
                System.out.print(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
 */