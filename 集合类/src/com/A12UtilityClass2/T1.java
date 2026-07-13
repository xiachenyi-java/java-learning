package com.A12UtilityClass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 夏辰义
 * 2026/6/3015:33
 */
public class T1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 3));
        // 1. 包装为不可变（视图，底层还是原集合）
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        //unmodifiable.add(1);❌ 抛 UnsupportedOperationException
        list.add(7);// 2. 但注意：原集合修改会影响不可变视图！
        System.out.println(unmodifiable);
        List<Integer> immutable = List.of(5,6,7,3,7);// 真正的不可变列表
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        // 1. 全部填充为同一个值
        Collections.fill(list2, "X");      // [X, X, X]// 2. 复制（目标列表必须有足够空间）
        List<String> dest = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(dest, list2);     // dest 变成 [X, X, X]
// 3. 统计出现次数
        int count = Collections.frequency(list2, "X");  // 3
    }
}
/*
Collections.emptyList();  // 不可变空列表
Collections.emptyMap();       // 空 Map
Collections.emptySet();       // 空 Set
Collections.singletonList("A"); // 单元素列表（不可变）
Collections.singletonMap("k", "v"); // 单元素 Map
Collections.singleton("A");     // 单元素 Set
 */
