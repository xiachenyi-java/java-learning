package com.A5Title;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 夏辰义
 * 2026/7/122:31
 */
public class T1 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教徒赴恒河圣裕引民众担忧", "");
        News news2 = new News("男子突然想起2个月前掉的鱼孩子网兜里，捞起来一看赶紧放生", "");
        ArrayList<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        Collections.reverse(list);
        System.out.println(list);
        for (int i = 0;i < list.size();i++){
            if (list.get(i).getTitle().length() > 15){
                String Title = list.get(i).getTitle();//。Java 中 String 是不可变的
                list.get(i).setTitle(Title.substring(0,15) + "...");
            }
        }
        System.out.println(list.get(1));
        System.out.println(list.get(0));
    }
}

