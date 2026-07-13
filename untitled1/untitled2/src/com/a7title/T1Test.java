package com.a7title;

public class T1Test {
    public static void main(String[] args) {
        T1[] t1 =new T1[4];
        t1[0] = new T2("夏辰义","男",18,100);
        t1[1] = new T2("廖玉麒","女",23,101);
        t1[2] = new T3("里老师","女",45,1000);
        t1[3] = new T3("王老师","男",64,1001);
        for (int i = 0;i < t1.length;i++){
            System.out.println(t1[i]);
        }
        System.out.println("\n");
        T1 Team = new T1();
        for (int i = 0; i < t1.length - 1; i++){
            for (int j = 0;j < t1.length - 1 -i; j++){
                if (t1[j].getAge() < t1[j+1].getAge()){
                    Team = t1[j];
                    t1[j] = t1[j+1];
                    t1[j+1] = Team;
                }
            }
        }
        for (int i = 0;i < t1.length;i++){
            System.out.println(t1[i]);
        }
        T4 t4 = new T4();
        t4.Z1(t1[0]);
        t4.Z1(t1[3]);
    }
}

