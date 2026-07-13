/**
 * 夏辰义
 * 2026/6/2323:16
 */
public class 体系 {
}
/*
Java 集合框架
    │
    ├── Collection（单列集合：存一个对象）
    │      ├── List（有序，可重复）
    │      │      ├── ArrayList（最常用，查询快）
    │      │      └── LinkedList（插入删除快）
    │      │
    │      ├── Set（无序/有序，不重复）
    │      │      ├── HashSet（去重，无序）
    │      │      ├── LinkedHashSet（去重，保持插入顺序）
    │      │      └── TreeSet（去重，自动排序）
    │      │
    │      └── Queue（队列，先进先出）
    │             └── LinkedList / PriorityQueue / ArrayDeque
    │
    └── Map（双列集合：存键值对 key-value）
           ├── HashMap（最常用，无序）
           ├── LinkedHashMap（保持插入顺序）
           └── TreeMap（按键自动排序）
           | 你的需求        | 选这个             | 原因                |
| ----------- | --------------- | ----------------- |
| 存列表，按顺序取    | `ArrayList`     | 查询快，最常用           |
| 频繁插入删除      | `LinkedList`    | 增删快               |
| 需要去重        | `HashSet`       | 自动去重，最快           |
| 去重 + 保持添加顺序 | `LinkedHashSet` | 去重且有序             |
| 去重 + 自动排序   | `TreeSet`       | 自动排好序             |
| 存键值对，快速查找   | `HashMap`       | 根据 key 找 value 最快 |
| 键值对 + 保持顺序  | `LinkedHashMap` | 按插入顺序遍历           |
| 键值对 + 按键排序  | `TreeMap`       | key 自动排序          |

一、ArrayList 底层
ArrayList = 动态数组
查询快：get(0) 直接算地址，O(1)
增删慢：插入/删除要移动后面所有元素，O(n)

二、LinkedList 底层
LinkedList = 双向链表
查询慢：要从头遍历，O(n)
增删快：改指针就行，O(1)

三、HashMap 底层（重点！
put("张三", 20) 流程：
1. 算 hash：hash("张三") → 比如 1001
2. 找位置：1001 % 数组长度 → 比如位置 1
3. 放元素：数组[1] = 新节点
4. 冲突了：数组[1] 已有元素，链表追加

四、HashSet 底层
只存 key，value 固定是一个空对象
利用 HashMap key 不重复的特性实现去重
 */
