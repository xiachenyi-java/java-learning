package com.A12Arrays;

import java.util.Arrays;

/**
 * 夏辰义
 * 2026/6/1913:02
 */
public class T1 {
    public static void main(String[] args) {
        int[] N1 = {1,6,2,51,2,53};
        Arrays.sort(N1);//对数组进行升序排序（基本类型）
       System.out.println(Arrays.toString(N1));// // 一行搞定，输出：[1, 2, 2, 6, 51, 53]
        int[] N2 = {1,6,2,51,2,53};
        Arrays.sort(N2,3,5);//对指定范围排序
        for (int num : N2){
            System.out.println(num);
        }
        System.out.println(Arrays.binarySearch(N1,6));
        int[] N3 = new int[5];
        Arrays.fill(N3,4);//全部填充为指定值
        System.out.println(Arrays.toString(N3));
        int[] N4 = new int[5];
        Arrays.fill(N4,1,2,5);//填充指定范围 [1, 2)
        System.out.println(Arrays.toString(N4));
        int[] N5 = new int[6];
        N5 = Arrays.copyOf(N1,6);//复制数组，可截断或扩展
        System.out.println(Arrays.toString(N5));
        int[] N6 = new int[6];
        N6 = Arrays.copyOfRange(N1,1,3);//复制指定范围 [from, to)
        System.out.println(Arrays.toString(N6));
    }
}
