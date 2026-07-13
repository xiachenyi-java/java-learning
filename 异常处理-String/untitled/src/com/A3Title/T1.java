package com.A3Title;

/**
 * 夏辰义
 * 2026/6/2111:24
 */
@SuppressWarnings("ALL")
public class T1 {
    public static void main(String[] args) {
        String str = "abcdef";
        A a = new A();
        System.out.println(str.charAt(0)+a.reverse(str,1,4)+str.charAt(5));
    }
}
class A{
    public static String reverse(String str,int start, int end){
        String Str = str.substring(start,end+1);
        String Str1 = "";
        for (int i = end-1;i >= 0;i--){
            Str1 += Str.charAt(i);
        }
        return Str1;
    }
}