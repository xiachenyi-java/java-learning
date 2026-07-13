package com.A10StringBuffer;

/**
 * 夏辰义
 * 2026/6/1721:08
 */
@SuppressWarnings("ALL")
public class T1 {
    public static void main(String[] args) {
        String N1 = "ABC";//// 字符串常量，不修改 → 用 String
        StringBuffer N2 = new StringBuffer("ABC");
        //多线程，频繁修改 → 用 StringBuffer（安全）
        StringBuilder N3 = new StringBuilder("ABC");
        //单线程字符串频繁修改 → 用 StringBuilder多
    }
}
/*
单线程字符串频繁修改 → 用 StringBuilder
多线程字符串频繁修改 → 用 StringBuffer
字符串不修改 → 用 String
 */
/*
String vs StringBuffer vs StringBuilder
表格
对比	String	StringBuffer	StringBuilder
可变性	❌ 不可变	✅ 可变	✅ 可变
线程安全	✅ 安全（只读）	✅ 安全（synchronized）	❌ 不安全
执行速度	慢（频繁修改时）	较慢（同步开销）	快（单线程推荐）
使用场景	字符串不常修改	多线程环境修改字符串	单线程环境修改字符串
 */