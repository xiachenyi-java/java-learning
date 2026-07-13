package com.A10Queue2;

import java.util.*;

/**
 * 夏辰义
 * 2026/6/2615:09
 */
public class T1 {
    public static void main(String[] args) {
 //Deque = Double Ended Queue，两端都能插入和删除，所以既能当队列也能当栈
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("A");
        deque.addLast("C");
        deque.add("D");
        System.out.println(deque);
        deque.poll();//会默认
        System.out.println(deque);
        //队列先进先出，栈先进后出
    }
}
