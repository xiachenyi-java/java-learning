package com.A12UtilityClass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 夏辰义
 * 2026/6/2823:12
 */
public class T1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(41,21,51,6,46,26,67,52));
        //一、排序相关
        Collections.sort(list);// 1. 自然排序（升序）
       System.out.println(list);
        Collections.sort(list,(a,b) ->b-a);// 2. 自定义排序（降序）
        System.out.println(list);
        Collections.reverse(list);// 3. 反转
        System.out.println(list);
        Collections.shuffle(list);// 4. 随机打乱
        System.out.println(list);
        Collections.swap(list,2,5);// 5. 交换两个位置
        System.out.println(list);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,8));//不明白
        System.out.println(Collections.max(list));//最大
        System.out.println(Collections.min(list));//最小
    }
}
/*
Collections.binarySearch(list, 8) 返回 -2 的含义：
    ↓
"8 不在列表中，如果要在保持有序的前提下插入 8，应该放在索引 1 的位置"
    ↓
插入点 = -(-2) - 1 = 1
 */
