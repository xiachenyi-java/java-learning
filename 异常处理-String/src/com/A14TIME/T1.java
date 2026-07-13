package com.A14TIME;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 夏辰义
 * 2026/6/19 19:28
 */
public class T1 {
    public static void main(String[] args) {
        // 当前日期
        LocalDate today = LocalDate.now();
        System.out.println("当前日期: " + today);  // 2026-06-19

        // 当前时间
        LocalTime now = LocalTime.now();
        System.out.println("当前时间: " + now);    // 19:36:xx.xxx

        // 当前日期时间
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("当前日期时间: " + dateTime);

        // 时间戳（毫秒）
        long millis = System.currentTimeMillis();
        System.out.println("毫秒时间戳: " + millis);

        // 时间戳（秒）—— 修复：用 Instant，不是 Integer
        long seconds = Instant.now().getEpochSecond();
        System.out.println("秒时间戳: " + seconds);

        // 格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = LocalDateTime.now().format(formatter);
        System.out.println("格式化后: " + formatted);  // "2026-06-19 19:36:00"

        // 解析字符串
        LocalDateTime parsed = LocalDateTime.parse("2026-06-19 19:30:00", formatter);
        System.out.println("解析结果: " + parsed);
    }
}