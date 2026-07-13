package com.a7title;

public class T4 {
    public void Z1(T1 t1){
        if (t1 instanceof T2){
            T2 t2 = (T2) t1 ;
            t2.A1();
        }
        if (t1 instanceof T3){
            T3 t3 = (T3) t1 ;
            t3.A1();
        }
    }
}
