package com.A5Iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * 夏辰义
 * 2026/6/2419:37
 */
@SuppressWarnings("ALL")
public class T1 {
    public static void main(String[] args) {
        Vector<String> xx = new Vector<>();
        xx.add("1");xx.add("5");xx.add("1");
        Iterator<String> it = xx.iterator();
        while (it.hasNext()){
            String tem = it.next();
            System.out.print(tem);
        }
    }
}
/*
public interface Iterator<E> {
    boolean hasNext();  // 是否还有下一个元素
    E next();           // 返回下一个元素
    void remove();      // 删除当前元素（可选操作）
}
 */