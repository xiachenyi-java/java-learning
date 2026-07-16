package com.A1File;

import java.io.File;

/**
 * 夏辰义
 * 2026/7/1516:54
 */
public class T1 {
    public static void main(String[] args) {
        // 方式1：完整路径（推荐）
        File file1 = new File("D:/test/demo.txt");
        //⚠️ 重要：创建 File 对象不会创建真实文件，只是创建了一个路径对象。
        // 方式2：父目录 + 子路径
        File file2 = new File("D:/test","demo.txt");
        //方式3：父 File 对象 + 子路径
        File parent = new File("D:/test");
        File file3 = new File(parent,"demo.txt");
    }
}
/*
一、File 类核心知识
File 本身不是流，它代表磁盘上的一个文件或目录的路径，用于：
创建/删除 文件和目录
获取文件属性（大小、权限、修改时间等）
遍历目录内容
 */