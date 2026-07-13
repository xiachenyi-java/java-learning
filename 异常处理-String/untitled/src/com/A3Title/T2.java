package com.A3Title;

/**
 * 夏辰义
 * 2026/6/2122:54
 */
//双指针交换：两个指针从子串两端向中间移动，每步交换一次，直到相遇。
public class T2 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str, 1, 4));  // aedcbf
    }

    public static String reverse(String str, int start, int end) {
        StringBuilder sb = new StringBuilder(str);
        int i = start, j = end;
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}//|        | 你的方法       | 老师的方法               |
  //      | ------ | ---------- | ------------------- |
    //    | **思路** | 切三段，中间反转再拼 | 原地交换                |
      //  | **内存** | 创建多个新字符串   | 只创建一个 StringBuilder |
       // | **代码** | 好懂         | 稍复杂但效率高             |
        //| **本质** | 用新对象装结果    | 直接修改原对象             |


