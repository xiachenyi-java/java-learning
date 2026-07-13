package com.A11Math;

/**
 * 夏辰义
 * 2026/6/1818:44
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println(Math.PI);//圆周率 π
        System.out.println(Math.E);//自然对数的底 e
        //1. 绝对值、最值、符号相关
        System.out.println(Math.abs(-22));//绝对值，支持 int/long/float/double
        System.out.println(Math.max(2,5));//取较大值
        System.out.println(Math.min(4,7));//取较小值
        System.out.println(Math.signum(-3));//返回符号：正数1.0，负数-1.0，0返回0.0
        //2. 幂运算与开方
        System.out.println(Math.pow(4,2));//4的2次方
        System.out.println(Math.sqrt(33));//平方根
        System.out.println(Math.exp(1));//e的1次方
        System.out.println(Math.log(2));//自然对数 ln
        System.out.println(Math.log10(2));//以10为底的对数
        //3. 取整方法（重点）
        System.out.println(Math.ceil(2.4));//向上取整
        System.out.println(Math.floor(3.3));//向下取整
        System.out.println(Math.round(4.4));//四舍五入取整
        System.out.println(Math.rint(4.2));//取最接近的整数，中间值取偶数
        //4. 其他实用方法
        System.out.println(Math.random());//返回 [0.0, 1.0) 之间的随机 double
        System.out.println(Math.hypot(3,5));// 5.0 (计算 √(x²+y²)，避免中间溢出)
        System.out.println(Math.IEEEremainder(10,3));//1.0 (IEEE 754 标准的余数)
        System.out.println(Math.copySign(5,-3));//-5.0 (复制第二个参数的符号给第一个)
    }
}
