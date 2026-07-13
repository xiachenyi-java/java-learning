package com.A6Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * 夏辰义
 * 2026/6/2419:51
 */
public class T1 {
    public static void main(String[] args) {
        //hashmap是没有顺序的
        Map<String,Integer> xx = new HashMap<>();
        xx.put("夏辰义",1);//添加数据
        xx.put("廖玉麒",2); //put(key, value) = 放进去
        System.out.println(xx.get("夏辰义"));//get(key) = 根据 key 取 value
        System.out.println(xx.get(1));//如果 key 不存在，返回 null
        System.out.println(xx.size());
        System.out.println(xx.remove("夏辰义"));
        System.out.println(xx.get("夏辰义"));
        xx.put("廖玉麒",5);
        System.out.println(xx.get("廖玉麒"));//输出：{001=95, 002=85}
        // 注意：001 变成了95，原来的90被覆盖了！
        for (String name : xx.keySet()) {
            System.out.println(name);
        }//遍历所有 key
        for (int hm : xx.values()){
            System.out.println(hm);
        }//遍历所有 value
        for (Map.Entry<String,Integer> entry : xx.entrySet()){
            String name = entry.getKey();
            int hx = entry.getValue();
            System.out.println(name +hx);
        }
    }
}
/*
entrySet() → 拿到所有"条目"
    ↓
for 遍历每个 entry
    ↓
entry.getKey()   → 拿"键"
entry.getValue() → 拿"值"
 */
