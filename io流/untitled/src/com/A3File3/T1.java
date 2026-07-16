package com.A3File3;

import java.io.File;

/**
 * 夏辰义
 * 2026/7/1517:33
 */
public class T1 {
    public static void main(String[] args) {
        File file = new File("D:/test/demo.txt");
        System.out.println("文件名" + file.getName());
        //getName只会显示最后一个
        System.out.println("绝对路径" + file.getAbsoluteFile());
        System.out.println("父路径" + file.getParent());
        System.out.println("是否存在" + file.exists());
        System.out.println("是否是文件" + file.isFile());
        System.out.println("是否是目录" + file.isDirectory());
        System.out.println("是否隐藏" + file.isHidden());
        System.out.println("是否可读" + file.canRead());
        System.out.println("是否可写" + file.canWrite());
        System.out.println("是否可执行" +file.canExecute());
        System.out.println("文件大小" + file.length());
        System.out.println("最后修改时间" +file.lastModified());
        // 转换可读大小
        long size = file.length();
        System.out.println("大小: " + formatSize(size));
    }
    static String formatSize(long size) {
        if (size < 1024) return size + " B";
        if (size < 1024 * 1024) return String.format("%.2f KB", size / 1024.0);
        if (size < 1024 * 1024 * 1024) return String.format("%.2f MB", size / (1024.0 * 1024));
        return String.format("%.2f GB", size / (1024.0 * 1024 * 1024));
    }
}
