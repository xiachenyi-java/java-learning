package com.A1Title;

@SuppressWarnings("all")
public class T1 {
    static private int Num = 100000;
    private int Number;

    static public int getNum(){
        Num += 100;
        return Num;
    }

    public T1(){
        Number = getNum();
    }


    public int getNumber() {
        return Number;
    }

    @Override
    public String toString(){
        return "序列号" + Num;
    }
}
