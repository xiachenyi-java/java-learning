package com.A9Queue1;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 夏辰义
 * 2026/6/2615:00
 */
public class T1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        //建议始终使用 offer/poll/peek，代码更健壮
        //如果你想实现【先进先出】的普通队列
        //应该用 LinkedList 或 ArrayDeque，不要用 PriorityQueue：
        //如果你想用 PriorityQueue（按优先级排序）
        queue.add("A");
        queue.offer("B");//入队
        System.out.println(queue.peek());// "A"（查看队首，不移除）
        System.out.println(queue.poll());//"A"（出队）
        System.out.println(queue.poll());//"B"
        System.out.println(queue.poll());// null（队列为空）
    }
}
/*
| 你的预期                      | 实际结果       | 原因                        |
| ------------------------- | ---------- | ------------------------- |
| 先进先出，先 `add("A")` 就先出 "A" | 确实是 "A" 先出 | 纯属巧合！因为 "A" 的字典序恰好比 "B" 小 |
|      | `ArrayDeque` / `LinkedList` | `PriorityQueue`  |
| ---- | --------------------------- | ---------------- |
| 出队顺序 | **插入顺序**（FIFO）              | **优先级顺序**（排序后）   |
| 用途   | 排队、缓冲、BFS                   | 任务调度、TopK、合并有序序列 |
| 底层   | 数组/链表                       | 堆                |

 */
