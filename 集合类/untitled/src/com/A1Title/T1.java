package com.A1Title;

import java.util.ArrayList;

/**
 * 夏辰义
 * 2026/6/2422:08
 */
public class T1 {
    public static void main(String[] args) {
        ArrayList<Integer> xt = new ArrayList<>();
        xt.add(85);xt.add(92);xt.add(78);
        xt.add(95);xt.add(88);
        xt.set(2,80);
        xt.remove(3);
        for (int num : xt){
            System.out.println(num);
        }
        int num0 = 0;
        for (int i = 0 ;i < xt.size();i++){
            num0 += xt.get(i);
        }
        System.out.println("平均成绩" + num0/xt.size());
    }
}
