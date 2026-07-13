package com.A5WrapperClass;

/**
 * 夏辰义
 * 2026/6/219:55
 */
public class T1 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer integer = 10;
         int n2 = integer;
         System.out.println(n1 + n2);
         Double d = 100d;
         System.out.println(d);
    }
}
/*
Java 的八大包装类（Wrapper Classes）对应 8 种基本数据类型，
用于将基本类型封装为对象，使其能够参与面向对象的操作（如集合存储、泛型、反射等）
基本类型	包装类	默认值	缓存范围（享元模式）
byte	Byte	null	-128 ~ 127
short	Short	null	-128 ~ 127
int	  Integer	null	-128 ~ 127
long	Long	null	-128 ~ 127
float	Float	null	无缓存
double	Double	null	无缓存
char	Character	null	0 ~ 127（即 \u0000 到 \u007f）
boolean	Boolean	null	true 和 false 两个实例
 */

