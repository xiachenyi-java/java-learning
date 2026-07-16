package com.A2File2;

import java.io.File;

/**
 * 夏辰义
 * 2026/7/1517:04
 */
public class T1 {
    public static void main(String[] args) throws Exception{
        // 1. 创建单级目录
        File dir = new File("D:/test");
        if (!dir.exists()){//存在
            boolean success = dir.mkdir();// 创建单级目录
            System.out.println("创建目录" + success);//在d盘里创建了一个test文件
        }
        File deepDir = new File("D:/test/a/b/c");
        boolean deepSuccess = deepDir.mkdirs();// 创建多级目录
        //mkdir() 只能创建单级目录，如果父目录不存在就会失败返回 false，
        // 而且不会抛异常，所以很容易误以为成功了。
        //方法1：用 mkdirs()（推荐）
        // ✅ 正确：mkdirs() 会一次性创建所有不存在的父目录
        System.out.println("创建多级目录: " + deepSuccess);
        File file = new File("D:/test/demo.txt");
        if (!file.exists()){
            boolean created = file.createNewFile();//// 真正创建空文件
            System.out.println("创建文件: " + created);
        }
    }
}
/*
mkdir()	创建单级目录	❌ 返回 false，什么都不创建
mkdirs()	创建多级目录	✅ 自动创建所有父目录
 */