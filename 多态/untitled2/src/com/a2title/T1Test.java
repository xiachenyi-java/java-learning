package com.a2title;

public class T1Test {
    public static void main(String[] args) {
        T1[] t1 = new T1[3];
        t1[0] = new T1("廖玉麒", 23, "医生");
        t1[1] = new T1("王老", 25, "老师");
        t1[2] = new T1("夏辰义", 18, "学生");
        for (T1 value : t1) {//增强版
            System.out.println(value);//重写toString才能直接输出
        }
        T1 team;
        for (int i = 0; i < t1.length - 1; i++){
            for (int j = 0; j < t1.length - 1 -i ; j++){
                if (t1[j].getAge() < t1[j + 1].getAge()){
                    team = t1[j];
                    t1[j] = t1[j + 1];
                    t1[j + 1] = team;
                }
            }
        }
        for (T1 value : t1){
            System.out.println(value);
        }
    }
}
/*
一、冒泡排序（一句话）
相邻元素两两比较，大的往前冒，每轮确定一个位置，共跑 n-1 轮。
二、核心代码模板（背下来）
// 从大到小排序
for (int i = 0; i < 数组.length - 1; i++) {           // 外层：控制轮数
    for (int j = 0; j < 数组.length - 1 - i; j++) {   // 内层：控制每轮比较次数
        if (数组[j] < 数组[j + 1]) {                   // 相邻比较（从小到大用 >）
            // 交换
            临时变量 = 数组[j];
            数组[j] = 数组[j + 1];
            数组[j + 1] = 临时变量;
        }
    }
}
length - 1	外层轮数	3个元素只需2轮确定位置
length - 1	内层初始边界	防止 j+1 越界
- i	优化：每轮少比一次	已排好的不再参与
 */