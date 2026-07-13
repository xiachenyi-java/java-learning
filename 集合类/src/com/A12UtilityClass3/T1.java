package com.A12UtilityClass3;

/**
 * 夏辰义
 * 2026/6/3015:55
 */
public class T1 {
}
/*
一、集合框架总览
plain
                    Collection（单列集合）                    Map（双列集合）
                         │                                        │
        ┌────────┬──────┴──────┬────────┐              ┌──────┴──────┐
        │        │             │        │              │             │
      List     Set         Queue    Deque           HashMap      TreeMap
        │        │             │        │              │             │
    ArrayList  HashSet    LinkedList ArrayDeque    LinkedHashMap  Hashtable
    LinkedList TreeSet    PriorityQueue               WeakHashMap   Properties
    Vector     LinkedHashSet
    Stack
二、Collection 接口体系
1. List（有序、可重复、有索引）
实现类	底层结构	线程安全	特点
ArrayList	数组	❌	查询快 O(1)，增删慢，默认容量10，扩容1.5倍
LinkedList	双向链表	❌	增删快 O(1)，查询慢，实现了 Deque
Vector	数组	✅	古老类，扩容2倍，已废弃，用 CopyOnWriteArrayList
Stack	数组	✅	继承 Vector，已废弃，用 Deque 代替
// 常用操作
List<String> list = new ArrayList<>();
list.add("a");           // 添加
list.get(0);             // 按索引获取
list.remove(0);          // 按索引删除
list.indexOf("a");       // 查找索引
list.subList(0, 2);      // 子列表（视图）
2. Set（无序、不重复）
实现类	底层结构	有序性	特点
HashSet	HashMap	❌ 无序	去重靠 hashCode() + equals()，允许null
LinkedHashSet	LinkedHashMap	✅ 插入序	维护双向链表记录插入顺序
TreeSet	红黑树	✅ 排序序	自然排序或自定义比较器，不允许null
// TreeSet 自定义排序
Set<Integer> set = new TreeSet<>((a, b) -> b - a); // 降序
3. Queue（队列，FIFO）& Deque（双端队列）
实现类	特点
LinkedList	双向链表，可作队列/栈
ArrayDeque	数组实现，效率更高，推荐替代 Stack
PriorityQueue	优先级队列，堆实现，自然排序或比较器
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);      // 入队（推荐，不抛异常）
queue.poll();        // 出队
queue.peek();        // 查看队首

Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);       // 压栈
stack.pop();         // 弹栈
stack.peek();        // 查看栈顶
三、Map 接口体系（键值对）
实现类	底层结构	线程安全	有序性	特点
HashMap	数组+链表+红黑树	❌	❌	默认容量16，扩容因子0.75，JDK8链表>8转红黑树
LinkedHashMap	数组+链表+双向链表	❌	✅ 插入/访问序	可设置 accessOrder=true 实现 LRU
TreeMap	红黑树	❌	✅ 排序序	按键排序，不允许null键
Hashtable	数组+链表	✅	❌	古老类，已废弃，全表锁
Properties	Hashtable	✅	❌	专用于配置文件，键值都是String
Map<String, Integer> map = new HashMap<>();
map.put("a", 1);
map.get("a");
map.containsKey("a");
map.keySet();        // 获取所有键
map.entrySet();      // 获取键值对集合（遍历推荐）

// 遍历推荐方式（Java 8+）
map.forEach((k, v) -> System.out.println(k + "=" + v));
四、Collections 工具类方法大全
分类	方法	作用
排序	sort(list)	自然排序
sort(list, comparator)	自定义排序
reverse(list)	反转
shuffle(list)	随机打乱
swap(list, i, j)	交换位置
rotate(list, distance)	循环移位
查找	binarySearch(list, key)	二分查找（需先排序）
max(list) / max(list, comparator)	最大值
min(list) / min(list, comparator)	最小值
frequency(list, obj)	元素出现次数
indexOfSubList(list, sub)	子列表索引
复制填充	copy(dest, src)	复制（dest 需足够大）
fill(list, obj)	全部填充为某值
replaceAll(list, old, new)	替换所有
nCopies(n, obj)	返回 n 个相同元素的不可变列表
包装	unmodifiableList(list)	只读视图
unmodifiableSet(set)	只读视图
unmodifiableMap(map)	只读视图
synchronizedList(list)	线程安全包装
synchronizedMap(map)	线程安全包装
singletonList(obj)	单元素不可变列表
emptyList()	空不可变列表
其他	reverseOrder()	返回逆序比较器
reverseOrder(comparator)	指定比较器逆序
五、Arrays 工具类（数组相关）
表格
方法	作用
Arrays.sort(arr)	数组排序
Arrays.binarySearch(arr, key)	二分查找
Arrays.copyOf(arr, newLength)	复制数组
Arrays.fill(arr, val)	填充数组
Arrays.toString(arr)	数组转字符串
Arrays.asList(arr)	数组转固定大小列表（不能增删）
Arrays.deepToString(arr)	多维数组转字符串
Arrays.equals(arr1, arr2)	数组比较
Arrays.stream(arr)	数组转流
⚠️ Arrays.asList() 返回的列表固定大小，增删会抛异常！
六、线程安全集合（JUC）
表格
类	特点
CopyOnWriteArrayList	读多写少，写时复制，遍历安全
CopyOnWriteArraySet	基于 CopyOnWriteArrayList
ConcurrentHashMap	分段锁（JDK7）/ CAS+红黑树（JDK8），高并发
ConcurrentLinkedQueue	CAS 无锁队列
BlockingQueue 家族	ArrayBlockingQueue, LinkedBlockingQueue, SynchronousQueue 等
java
// ConcurrentHashMap 使用
Map<String, Integer> safeMap = new ConcurrentHashMap<>();
safeMap.put("a", 1);

// 原子操作
safeMap.computeIfAbsent("b", k -> 2);   // 不存在则计算
safeMap.merge("a", 1, Integer::sum);     // 存在则合并
七、快速对比表
表格
需求	推荐选择
频繁查询，少增删	ArrayList
频繁增删，少查询	LinkedList
需要去重	HashSet / LinkedHashSet
需要排序	TreeSet / TreeMap
键值对存储	HashMap
按插入顺序遍历	LinkedHashMap
高并发读多写少	CopyOnWriteArrayList
高并发键值对	ConcurrentHashMap
实现 LRU 缓存	LinkedHashMap(accessOrder=true)
栈（LIFO）	ArrayDeque（不要用 Stack）
队列（FIFO）	ArrayDeque / LinkedList
八、核心面试考点
表格
问题	答案
ArrayList vs LinkedList	数组 vs 链表，查询 O(1) vs O(n)，增删 O(n) vs O(1)
HashMap 底层	数组+链表+红黑树，hash冲突用链地址法，>8转红黑树
HashMap 扩容	容量×2，重新计算hash位置（JDK8优化：要么原位，要么原位+旧容量）
ConcurrentHashMap 线程安全	JDK7 分段锁（Segment），JDK8 CAS+synchronized+红黑树
fail-fast vs fail-safe	ArrayList 迭代时修改抛异常；CopyOnWriteArrayList 复制快照不抛异常
九、一句话速记口诀
List 有序可重复，Set 去重无顺序，Map 键值对存储。
Array 查询快，Linked 增删快，Hash 平均好，Tree 会排序。
线程不安全用 JUC，只读视图用 Collections，真正不可变用 List.of()
 */
