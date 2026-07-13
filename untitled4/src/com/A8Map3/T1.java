package com.A8Map3;

import java.util.Map;
import java.util.TreeMap;

/**
 * 夏辰义
 * 2026/6/2421:31
 */
public class T1 {
    public static void main(String[] args) {
// TreeMap，它是 Map 家族里功能最强的——按键自动排序
// TreeMap = 自动把 key 排好序的字典
// TreeMap 不允许 null key
        Map<Integer,String> num = new TreeMap();
        num.put(4,"四");num.put(6,"六");
        num.put(2,"二");num.put(3,"三");num.put(8,"八");
        System.out.println(num);//自动排序
        //字符串也能自动排序（字典序）
    }
}
/*
|          | HashMap | LinkedHashMap | **TreeMap** |
| -------- | ------- | ------------- | ----------- |
| 顺序       | ❌ 无序    | ✅ 插入顺序        | ✅ **按键排序**  |
| 底层       | 哈希表     | 哈希表+链表        | **红黑树**     |
| 速度       | O(1)    | O(1)          | O(log n)    |
| null key | ✅ 允许    | ✅ 允许          | ❌ **不允许**   |
| 特有功能     | 无       | 无             | 范围查询        |
TreeMap<Integer, String> map = new TreeMap<>();
map.put(10, "A");
map.put(20, "B");
map.put(30, "C");
map.put(40, "D");
map.put(50, "E");

// 1. 第一个 key（最小的）
Integer first = map.firstKey();           // 10

// 2. 最后一个 key（最大的）
Integer last = map.lastKey();             // 50

// 3. 比 25 大的最小 key
Integer higher = map.higherKey(25);       // 30

// 4. 比 25 小的最大 key
Integer lower = map.lowerKey(25);         // 20

// 5. 子 Map：key 在 20 到 40 之间（不包括40）
TreeMap<Integer, String> sub = new TreeMap<>(map.subMap(20, 40));
// sub = {20=B, 30=C}

// 6. 头部：key 小于 30 的
TreeMap<Integer, String> head = new TreeMap<>(map.headMap(30));
// head = {10=A, 20=B}

// 7. 尾部：key 大于等于 30 的
TreeMap<Integer, String> tail = new TreeMap<>(map.tailMap(30));
// tail = {30=C, 40=D, 50=E}
 */
