public class a15可变参数 {
    public static void main(String[] args) {
        A a = new A();
        int b = a.A1(1,364,37,379,99);
        System.out.println(b);
    }
    static class A{
        public int A1(int...n){
            int i = 0;
            for (int j = 0; j < n.length ; j++){
                i += n[j];
            }
            return i;
        }
    }
}
//可变参数的实参可以为0，
//可以是数组
//可变参数的本质是数组
//可变参数可以和普通参数一起放在形参列表，但是最后是可变参数
//一个形参列表只能用一个可变参数
// public int A1(double a,int...n）是可以的
// public int A1(int...n，double a）不行
/*
定义	方法参数数量不确定，用 ... 声明
作用	一个方法接收 0 ~ N 个同类型参数
规则	只能是最后一个参数，只能有一个
特点	内部转为数组处理，调用时自动打包
本质	一个方法，参数是数组
 */