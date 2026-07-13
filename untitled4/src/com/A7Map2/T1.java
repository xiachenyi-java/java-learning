package com.A7Map2;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 夏辰义
 * 2026/6/2421:03
 */
@SuppressWarnings("all")
public class T1 {
    public static void main(String[] args) {
        //LinkedHashMap = HashMap 的功能 + 按添加顺序遍历
        LinkedHashMap<Integer,String> xx =  new LinkedHashMap();
        xx.put(1,"A");xx.put(2,"B");xx.put(3,"C");
        for (Map.Entry<Integer,String> entry : xx.entrySet()){
            int num = entry.getKey();
            String name = entry.getValue();
            System.out.println(name + num);
        }
    }
}
/*
|      | HashMap   | **LinkedHashMap** |
| ---- | --------- | ----------------- |
| 存取速度 | O(1) 最快   | O(1) 较快           |
| 遍历顺序 | ❌ 无序（不固定） | ✅ **保持插入顺序**      |
| 底层结构 | 哈希表       | 哈希表 + **双向链表**    |
| 方法   | 一样        | 完全一样              |
所有方法和 HashMap 一模一样
map.put("张三", 20);           // 添加
map.get("张三");               // 取值
map.remove("张三");            // 删除
map.containsKey("张三");       // 判断有没有
map.size();                   // 大小
map.isEmpty();                // 是否为空
map.clear();                  // 清空
区别只有一个：遍历的顺序 = 插入的顺序
 */