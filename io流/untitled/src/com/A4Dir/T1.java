package com.A4Dir;

/**
 * 夏辰义
 * 2026/7/1517:56
 */
import java.io.File;
import java.io.FilenameFilter;

public class T1 {
    public static void main(String[] args) {
        File dir = new File("D:/test");

        // 方式1：只获取名称（String[]）
        String[] names = dir.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 方式2：获取 File 对象数组（推荐，信息更丰富）
        File[] files = dir.listFiles();
        for (File f : files) {
            String type = f.isDirectory() ? "[目录]" : "[文件]";
            System.out.println(type + " " + f.getName() + " (" + f.length() + " bytes)");
        }
        // 只列出 .txt 文件
        File[] txtFiles = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        // Lambda 简化（Java 8+）
        File[] javaFiles = dir.listFiles((d, name) -> name.endsWith(".java"));

        for (File f : txtFiles) {
            System.out.println(f.getName());
        }
    }
}