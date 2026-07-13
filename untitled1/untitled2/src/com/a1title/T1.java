package com.a1title;

public class T1 {
    int Cpu;
    int memory;
    int HadrDish;
    public T1(){
        Cpu = 0;
        memory = 0;
        HadrDish = 0;
    }
    public T1(int Cpu, int memory, int HadrDish){
        this.HadrDish = HadrDish;
        this.Cpu = Cpu;
        this.memory = memory;
    }
    public void getT1(){
        System.out.println("cpu是"+ Cpu + "硬盘是" + HadrDish + "内存是" + memory);
    }
}
