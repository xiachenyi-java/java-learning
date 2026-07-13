package com.A4Title;

import java.util.Scanner;

/**
 * 夏辰义
 * 2026/6/2123:00
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println("请创建用户名");
        Scanner MyScanner = new Scanner(System.in);
        String YH = MyScanner.nextLine();
        if (YH.length() >= 2 && YH.length() <= 4){
            System.out.println("创建成功");
        }else {
            throw new RuntimeException("用户名要求长度2到4");
        }
        System.out.println("请创建密码");
        String MM = MyScanner.nextLine();
        if (MM.length() != 6) {
            throw new RuntimeException("密码必须为6位");
        }
        for (int i = 0;i < 6;i++){
           char C = MM.charAt(i);
           if (C < '0' ||  C > '9' ){
               throw new RuntimeException("密码全部为数字");
           }
        }
        System.out.println("创建成功");
        int ten = -1;
        int tem1 = -1;
        System.out.println("请创建邮箱");
        String YX = MyScanner.nextLine();
        for (int i = 0; i < YX.length();i++){
            char C = YX.charAt(i);
            if (C == '@'){
                 ten = i;
            }
            if (C =='.'){
                tem1 = i;
            }
        }
        if ( ten==-1 || tem1==-1){
            throw new RuntimeException("邮箱要有@和.");
        }
        if (ten > tem1){
            throw new RuntimeException("@要在.的前面");
        }
        System.out.println("邮箱创建成功");
        System.out.println("全部创建成功！");
    }
}
