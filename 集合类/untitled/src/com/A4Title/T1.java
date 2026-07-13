package com.A4Title;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 夏辰义
 * 2026/6/2511:27
 */
@SuppressWarnings("all")
public class T1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> xt = new LinkedHashMap<>();
        Scanner MyScanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-3");
            System.out.println("1：增加学生成绩");
            System.out.println("2：查询某个学生平均分");
            System.out.println("3：输出所有学生的成绩和平均分");
            int i = MyScanner.nextInt();
            MyScanner.nextLine();
            switch (i){
                case 1:
                    ArrayList<Integer> cj = new ArrayList<>();
                    System.out.println("请输入语文，数学，英语的成绩");
                    for (int j = 0;j < 3;j++){
                        cj.add(MyScanner.nextInt());
                    }
                    MyScanner.nextLine();
                    System.out.println("输入学生姓名");
                    xt.put(MyScanner.nextLine(),cj);
                    break;
                case 2:
                    System.out.println("请输入名字");
                    String str = MyScanner.nextLine();
                    int num0 = 0;
                    if (xt.containsKey(str)){
                        for (int n = 0;n < 3;n++){
                            num0 += xt.get(str).get(n);
                        }
                        System.out.println(str + "的平均分为" + num0 / 3);
                    }
                    if (num0 == 0){
                        System.out.println("没有此人");
                    }
                    break;
                case 3:
                    System.out.println(xt);
                    break;
            }
        }
    }
}
