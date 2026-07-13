package com.A9String2;

/**
 * 夏辰义
 * 2026/6/1621:36
 */
@SuppressWarnings("all")
public class T1 {
    public static void main(String[] args) {
        String N1 = "ABCDABEa";
        String N2 = "";
        //1. 获取信息
        System.out.println(N1.length());//字符串长度
        System.out.println(N2.isEmpty());//是否为空串（""）
        System.out.println(N1.isBlank());//是否为空或仅空白字符
        System.out.println(N1.charAt(2));//指定位置字符
        /*
        isEmpty() vs isBlank()：
        isEmpty()：仅当 length() == 0 时返回 true（即 ""）
        isBlank()：字符串为空 或 仅包含空白字符（空格、制表符、换行等）时返回 true
         */
        //2. 查找/搜索
        System.out.println(N1.indexOf("A"));//首次出现位置
        System.out.println(N1.indexOf("BC"));//	子串首次出现位置
        System.out.println(N1.indexOf("C",1));//从指定位置开始找
        System.out.println(N1.lastIndexOf("A"));//最后一次出现位置
        System.out.println(N1.contains("BC"));//是否包含子串
        //3. 比较
        System.out.println(N1.equals(N2));//内容相等
        System.out.println(N1.equalsIgnoreCase(N2));//忽略大小写比较
        System.out.println(N1.compareTo(N2));//字典序比较
        //4.截取/提取
        System.out.println(N1.substring(4));//从某位置截取到末尾
        System.out.println(N1.substring(1,4));//截取 [1, 4)
        System.out.println(N1.split(","));//按正则分割
        System.out.println(N1.trim());//去首尾空格
        //5. 替换
        System.out.println(N1.replace('A','j'));//替换所有字符
        System.out.println(N1.replace("AB","Cc"));//替换所有子串
        System.out.println(N1.replaceAll("\\d","_"));//正则代替
        //6. 大小写转换
        System.out.println(N1.toLowerCase());//转小写
        System.out.println(N1.toUpperCase());//转大写
        //7. 连接/拼接
        System.out.println(N1.concat(N1));//拼接字符串
        System.out.println(String.join(N1, N2));//用分隔符连接多个字符串
    }
}
