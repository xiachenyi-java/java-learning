package com.A6Title;

import java.util.Scanner;

/**
 * 夏辰义
 * 2026/5/2921:23
 */
public class Test {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("");
        switch (MyScanner.nextLine()){
            case "red" :
                Color ren = Color.REN;
                ren.show();
                break;
            case "blue":
                Color.BLUE.show();
                break;
            case "black" :
                Color.BLACK.show();
                break;
            case "yellow" :
                Color.YELLOW.show();
                break;
            case "green" :
                Color.GREEN.show();
                break;
        }
    }
}
