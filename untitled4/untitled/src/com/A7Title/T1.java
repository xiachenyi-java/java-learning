package com.A7Title;

import java.util.HashMap;
import java.util.Map;

/**
 * 夏辰义
 * 2026/7/322:51
 */
public class T1 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        m.put("jack",2600);
        System.out.println(m);
        m.put("jack",2700);
        m.put("tom",1300);
        m.put("smith",3000);
        for (String name :m.keySet()){
            System.out.println(name);
        }
        for (int n :m.values()){
            System.out.println(n);
        }
    }
}
