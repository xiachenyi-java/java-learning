package com.a1title;

public class T3 extends T1{
    String Color;
    public T3(){
        super();
         Color = "无";
    }
    public T3(String Color,int Cpu, int memory, int HadrDish){
        super(Cpu,memory,HadrDish);
        this.Color = Color;
    }
    public void getT1(){
        System.out.println("cpu是"+ Cpu + "硬盘是" + HadrDish + "内存是" + memory + "颜色是" +Color);
    }
}
