package com.A3Title;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 夏辰义
 * 2026/6/2423:29
 */
public class T1 {
    public static void main(String[] args) {
        Map<String,Integer> xx = new HashMap<>();
        Scanner MyScaaner = new Scanner(System.in);
        System.out.println("");
        String str = MyScaaner.nextLine();
        for (char c : str.toCharArray()){
            if (xx.containsKey(c + "")){
                xx.put(c +"",xx.get(c + "") + 1);
            }else {
                xx.put(c + "",1);
            }
        }
        System.out.println(xx);
    }
}
