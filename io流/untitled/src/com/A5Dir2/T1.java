package com.A5Dir2;

import java.io.File;

/**
 * 夏辰义
 * 2026/7/1518:09
 */
public class T1 {
    public static void main(String[] args) {
        File root = new File("D:/test");
        listAll(root, 0);
    }

    // 递归打印目录树
    static void listAll(File file, int depth) {
        // 缩进
        String indent = "  ".repeat(depth);

        if (file.isDirectory()) {
            System.out.println(indent + "📁 " + file.getName() + "/");
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    listAll(child, depth + 1);
                }
            }
        } else {
            System.out.println(indent + "📄 " + file.getName()
                    + " (" + file.length() + " bytes)");
        }
    }
}