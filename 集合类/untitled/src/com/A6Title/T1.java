package com.A6Title;

import java.util.ArrayList;
import java.util.List;

/**
 * 夏辰义
 * 2026/7/218:03
 */
public class T1 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("宝马",400000);
        Car car2 = new Car("宾利",5000000);
        list.add(car1);
        list.add(car2);
        list.remove(1);
        System.out.println(list.contains(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        list.add(car2);
        list.addAll(list);
        System.out.println(list);
        System.out.println(list.containsAll(list));
        //list.removeAll()
        //从当前集合中移除所有包含在指定集合中的元素（批量删除）。
    }
}
class Car{
    String name;
    int price;

    public Car(String name,int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return name+price;
    }
}
