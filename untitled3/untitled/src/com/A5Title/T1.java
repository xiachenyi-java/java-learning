package com.A5Title;

import java.util.Scanner;

/**
 * 夏辰义
 * 2026/6/2215:02
 */
public class T1 {
    public static void main(String[] args) {
         Scanner MyScanner = new Scanner(System.in);
         String Str1 = "";
         String Str2 = "";
         String Str3 = "";
         System.out.println("请输入名字");
         String Str = MyScanner.nextLine();
         for (int i = 0;i<Str.length();i++){
             Str1 += Str.charAt(i);
             if (Str.charAt(i) == ' ') break;
         }
        for (int i = Str1.length();i<Str.length();i++){
            Str2 += Str.charAt(i);
            if (Str.charAt(i) == ' ') break;
        }
        for (int i = Str1.length()+Str2.length();i<Str.length();i++){
            Str3 += Str.charAt(i);
            if (Str.charAt(i) == ' ') break;
        }
        System.out.println(Str3 + Str1 + Str2.charAt(0));
    }
}
