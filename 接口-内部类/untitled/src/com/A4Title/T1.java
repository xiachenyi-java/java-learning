package com.A4Title;

public class T1 {
    private String NAME = "小夏";
    public void A0(){
        class TT1{
            private String name = "夏辰义";

            public void AA(){
                System.out.println("名字是" + name);
            }
        }
        TT1 tt1 = new TT1();
        tt1.AA();
        System.out.println("小名是" + NAME);
    }
}
