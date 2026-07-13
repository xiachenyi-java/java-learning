package com.A2Title;

/**
 * 夏辰义
 * 2026/5/3121:21
 */
public class T1 {
    public static void main(String[] args) {
        try {
            // 检查命令行参数数量
            if (args.length < 2) {
                throw new IllegalArgumentException("缺少命令行参数！需要提供两个整数参数。");
            }

            // 解析第一个参数
            int n1;
            try {
                n1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("第一个参数格式不正确：'" + args[0] + "' 不是有效的整数。");
            }

            // 解析第二个参数
            int n2;
            try {
                n2 = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("第二个参数格式不正确：'" + args[1] + "' 不是有效的整数。");
            }

            // 调用 cal 方法计算
            int result = cal(n1, n2);
            System.out.println(n1 + " / " + n2 + " = " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("错误：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("错误：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("未知错误：" + e.getMessage());
        }
    }

    public static int cal(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("除数不能为0！");
        }
        return n1 / n2;
    }
}