package com.A7FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 夏辰义
 * 2026/7/1615:41
 */
public class T1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:/test/demo.txt")) {
            int b;
            while ((b = fis.read()) != -1){
                //read()	读 1 个字节	0~255 的字节值，-1 表示读完
                //read(byte[] b)	读 一批字节 到数组	实际读到的字节数，-1 表示读完
                //read(byte[] b, int off, int len)	读一批字节到数组指定位置	实际读到的字节数，-1 表示读完
                System.out.print((char) b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        // 不需要 finally，fis 自动关闭
    }
}



/*
程序 ←—— FileInputStream —— 文件（硬盘）输入
程序 —— FileOutputStream ——→ 文件（硬盘）输出
现在可以正常读取，文件信息，但是中文回乱码
处理方法是数组
解决完中文，之后发现代码太多了，现在在下面用更简洁的方法搞定
源代码：
FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/test/demo.txt");
            //读取文件
            int b;
            //解决中文乱码问题
            byte[] bytes = new byte[1024];
            try {
                while ((b = fis.read(bytes)) != -1){// 一次读1个字节
                    //System.out.print((char)b);中文乱码问题，一个中文有3个字符一个个取会有乱码
                    String s = new String(bytes,0,b, StandardCharsets.UTF_8);
                    System.out.println(s);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
 */