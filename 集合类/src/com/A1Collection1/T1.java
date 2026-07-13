package com.A1Collection1;

import java.util.ArrayList;

/**
 * 夏辰义
 * 2026/6/2222:40
 */
//ArrayList 就像一个自动扩容的数组，你可以往里面放东西，它会自动帮你管理大小。
public class T1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //这个尖括号叫"泛型"，告诉编译器：这个盒子只能放 String
        names.add("夏辰义");//add() = 添加
        names.add("廖玉麒");
        System.out.println("人数" +names.size());//size() = 有多少个
        System.out.println("第一个人是" + names.get(0));//get(0) = 取第1个（编号从0开始！）
        for (int i = 0;i < names.size();i++){
            System.out.println("第" + (i+1) + "人是" + names.get(i));
        }
        names.remove(1);//删除第2个人（李四），后面的人往前移
        names.remove("r");//删除叫"r"的人
        names.set(0,"廖玉麒");//把第5个人改成"廖玉麒"
        names.clear();//清空所有人
        for (String name : names){
            System.out.println(name);
        }//读作："对于 names 里的每一个 name，执行...
        System.out.println(names.contains("老王"));//找老五
    }
}
