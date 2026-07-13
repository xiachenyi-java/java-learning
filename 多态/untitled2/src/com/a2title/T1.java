package com.a2title;

public class T1 {
    private String name;
    private int age;
    private String job;//工作

    public T1(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void sort(T1 t1, T1 t2, T1 t3) {
        if (t1.getAge() > t2.getAge() && t1.getAge() > t3.getAge()) {
            if (t2.getAge() > t3.getAge()) {
                System.out.println("最大的" + t1.getAge() + "第二大的" + t2.getAge() + "最小的" + t3.getAge());
            } else {
                System.out.println("最大的" + t1.getAge() + "第二大的" + t3.getAge() + "最小的" + t2.getAge());
            }
        }
        if (t2.getAge() > t1.getAge() && t2.getAge() > t3.getAge()) {
            if (t1.getAge() > t3.getAge()) {
                System.out.println("最大的" + t2.getAge() + "第二大的" + t1.getAge() + "最小的" + t3.getAge());
            } else {
                System.out.println("最大的" + t2.getAge() + "第二大的" + t3.getAge() + "最小的" + t1.getAge());
            }
        }
        if (t3.getAge() > t1.getAge() && t3.getAge() > t2.getAge()) {
            if (t1.getAge() > t2.getAge()) {
                System.out.println("最大的" + t3.getAge() + "第二大的" + t1.getAge() + "最小的" + t2.getAge());
            } else {
                System.out.println("最大的" + t3.getAge() + "第二大的" + t2.getAge() + "最小的" + t1.getAge());
            }
        }
    }

    @Override
    public String toString() {
        return name + age + job;
    }
}
