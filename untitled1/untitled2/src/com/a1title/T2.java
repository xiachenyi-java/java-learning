package com.a1title;

public class T2 extends T1{
    String brand;
    public T2(){
        super();
         brand = "无";
    }
    public T2(String brand,int Cpu, int memory, int HadrDish){
        super(Cpu,memory,HadrDish);
        this.brand = brand;
    }
    public void getT1(){
        System.out.println("cpu是"+ Cpu + "硬盘是" + HadrDish + "内存是" + memory + "品牌是" + brand);
    }
}
