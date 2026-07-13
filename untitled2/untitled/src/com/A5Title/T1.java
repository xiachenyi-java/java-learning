package com.A5Title;

public class T1 {
    private double Tem;
    class TT1{
        public void A(){
            if (Tem > 40){
                System.out.println("吹冷风---");
            }else if (Tem < 0){
                System.out.println("吹热风---");
            }else {
                System.out.println("关闭空调");
            }
        }
    }
    public TT1 getTT1(){
        return new TT1();
    }
    public T1(double Tem){
        this.Tem = Tem;
    }
}
