package com.A4Collection4;

import java.util.TreeSet;

/**
 * 夏辰义
 * 2026/6/2322:27
 */
public class T1 {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);num.add(4);num.add(7);
        num.add(3);num.add(2);num.add(1);
        System.out.println(num);// 注意：自动从小到大排好了！
        for (int num0 : num){
            System.out.print(num0);
        }
        System.out.println("\n"+num.size());
        System.out.println(num.contains(2));
        num.remove(4);
        System.out.println(num.isEmpty());
        //独特的方法
        System.out.println(num.first());//第一个（最小的）
        System.out.println(num.last());//最后一个（最大的）
        System.out.println(num.higher(5));//比 5 大的最小值
        System.out.println(num.lower(6));//比 6 小的最大值
        System.out.println(num.subSet(2,5));//子集：2 到 5
        System.out.println(num.headSet(4));//头部：小于4的
        System.out.println(num.tailSet(4));//尾部：大于等于4的
    }
}
/*
重要：TreeSet 不允许 null
添加数据：5, 2, 8, 2, 1
HashSet        →  {1, 2, 5, 8}  或 {2, 8, 1, 5}... 无序
LinkedHashSet  →  {5, 2, 8, 1}      保持添加顺序
TreeSet        →  {1, 2, 5, 8}      自动排序
 */
