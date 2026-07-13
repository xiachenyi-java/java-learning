import java.util.Scanner;
public class a9类与对象 {
    public static void main(String[] args) {
        A a = new A();
        Scanner myScanner = new Scanner(System.in);
        a.i = myScanner.nextInt();
        System.out.println("输入的整数是：" + a.i);
        int q = 5;
        a.B(q);
        System.out.println("这是实参 q：" + q); // 仍然是5，不会被方法改变
    }

    static class A {
        int i;
        double j;
        char x;
        String y;

        public void B(int s) {
            System.out.println("这是一个方法");
            s++;
            System.out.println("这是形参 s：" + s);
        }
    }
}
    //在类里面每一个新建的类后面都有（）这是用来传递形参的
    //类和方法就是一个可变动的数据类型和函数
    //他是多样的，但是和主函数的数据类型不能冲突
    //形参不能改变实参
    //每次只能返回一个值但是可以返回数组
    //代码有问题但是改成静态内部类就可以了