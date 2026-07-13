package com.A11Maptraverse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 夏辰义
 * 2026/6/2615:34
 */
public class T1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("五",5);
        map.put("二",2);
        map.put("三",3);
        //1:EntrySet 遍历（⭐最推荐）
        //为什么最推荐？
        //只遍历一次 Map，效率最高
        //同时拿到 key 和 value，最常用
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String name = entry.getKey();;
            int num =entry.getValue();
            System.out.println(num + name);
        }
        //方式 2：Java 8 forEach（⭐最简洁
        map.forEach((key,value) ->{System.out.println(key + "=" + value);});
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 25) {
                it.remove();  // ✅ 安全的删除方式
            }
        }
        System.out.println(map);  // {Bob=30}
    }
}
/*
| 方式       | 代码                               | 同时取 key+value | 效率    | 适用场景        |
| -------- | -------------------------------- | ------------- | ----- | ----------- |
| EntrySet | `for (Entry e : map.entrySet())` | ✅             | ⭐⭐⭐ 高 | 最常用，首选      |
| forEach  | `map.forEach((k,v)->...)`        | ✅             | ⭐⭐⭐ 高 | 代码最简洁，推荐    |
| KeySet   | `for (String k : map.keySet())`  | ❌（要额外 get）    | ⭐⭐ 低  | 只需要 key     |
| Values   | `for (Integer v : map.values())` | ❌             | ⭐⭐ 低  | 只需要 value   |
| Iterator | `iterator()` + `it.remove()`     | ✅             | ⭐⭐⭐ 高 | **遍历中需要删除** |

 */