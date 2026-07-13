package com.A3Title;

public class Test {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.testwork(new Ta() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,23
        );
    }
}
