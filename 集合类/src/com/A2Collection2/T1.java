package com.A2Collection2;

import java.util.HashSet;

/**
 * 夏辰义
 * 2026/6/2319:46
 */
//HashSet 就是"自动去重的集合"，东西放进去，重复的会自动消失。
public class T1 {
    public static void main(String[] args) {
        HashSet<Integer> Num = new HashSet<>();
        Num.add(1);
        Num.add(2);
        Num.add(1);
        System.out.println(Num.size());
        Num.remove(2);
        System.out.println(Num.contains(1));
        Num.clear();
        System.out.println(Num.isEmpty());
        for (int num : Num){
            System.out.println(num);
        }
    }
}
/*
表格
ArrayList	HashSet
像什么	有序的队伍（排队买票）	无序的袋子（抓阄）
能重复吗	✅ 能重复	❌ 自动去重
有顺序吗	✅ 有顺序（第1个、第2个...）	❌ 没有固定顺序
怎么取	get(0) 按编号取	不能按编号取，只能遍历
一句话：HashSet 就是"自动去重的集合"，东西放进去，重复的会自动消失。
| 功能   | ArrayList                          | HashSet           |
| ---- | ---------------------------------- | ----------------- |
| 添加   | `add()`                            | `add()`           |
| 删除   | `remove(index)` / `remove(object)` | `remove(object)`  |
| 查找   | `get(index)`                       | ❌ 没有 `get(index)` |
| 判断包含 | `contains()`                       | `contains()`      |
| 大小   | `size()`                           | `size()`          |
| 重复   | ✅ 允许                               | ❌ 自动去重            |
| 顺序   | ✅ 有序（按添加顺序）                        | ❌ 无序              |
| 适用场景 | 需要按顺序存取                            | 需要去重、判断存在性        |

 */

