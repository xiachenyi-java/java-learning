package com.A2Try;

/**
 * 夏辰义
 * 2026/5/3117:44
 */
public class T1 {
    public static void main(String[] args) {
        try{
            int a = 1/0;
        }catch (Exception e){
            System.out.println("捕获异常");
        }finally {
            System.out.println("固定输入");
        }
    }
}
/*
| 要点       | 说明                            |
| -------- | ----------------------------- |
| **必须配合** | 至少有一个 `catch` 或 `finally`     |
| **代码范围** | 只放可能出问题的代码，不要放太多无关代码          |
| **异常触发** | 一旦抛出异常，try 内**后续代码不再执行**      |
| **无异常时** | 正常执行完 try，跳过 catch，进入 finally |

 */