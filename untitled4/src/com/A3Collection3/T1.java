package com.A3Collection3;

import java.util.LinkedHashSet;

/**
 * 夏辰义
 * 2026/6/2320:56
 */
//LinkedHashSet = HashSet 的去重功能 + ArrayList 的有序功能
public class T1 {
    public static void main(String[] args) {
        LinkedHashSet<String> XX = new LinkedHashSet<>();
        XX.add("百度");
        XX.add("拼多多");
        XX.add("淘宝");
        for (String Str : XX){
            System.out.println(Str);
        }
        System.out.println(XX.size());
        System.out.println(XX.contains("淘宝"));
        System.out.println(XX.isEmpty());
        XX.remove("淘宝");
        for (String Str : XX){
            System.out.println(Str);
        }
        XX.clear();
    }
}
/*
|        | HashSet | LinkedHashSet |
| ------ | ------- | ------------- |
| **去重** | ✅       | ✅             |
| **顺序** | ❌ 无序    | ✅ **保持添加顺序**  |
| **底层** | 哈希表     | 哈希表 + 链表      |
| **速度** | 更快一点点   | 稍微慢一点点（但差别很小） |
| 特性      | HashSet | LinkedHashSet | TreeSet      |
| ------- | ------- | ------------- | ------------ |
| 去重      | ✅       | ✅             | ✅            |
| 有序      | ❌ 无序    | ✅ 插入顺序        | ✅ 自然排序       |
| 允许 null | ✅       | ✅             | ❌            |
| 速度      | 最快      | 较快            | 较慢（O(log n)） |

 */

