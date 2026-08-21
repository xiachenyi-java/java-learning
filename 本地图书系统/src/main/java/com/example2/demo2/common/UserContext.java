package com.example2.demo2.common;

/**
 * 夏辰义
 * 2026/8/2117:53
 */
public class UserContext {

    //局部线程变量
    private static final ThreadLocal<Integer> userHolder = new ThreadLocal<>();

    public static void setUserId(Integer userId) {
        userHolder.set(userId);
    }
    public static Integer getUserId() {
        return userHolder.get();
    }
    public static void remove() {
        userHolder.remove();
    }
}
