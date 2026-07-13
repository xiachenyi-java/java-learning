import java.util.Scanner;
//引入scanner类所在的包
public class a3输入 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//创建一个Scanner的对象，new创建一个对象
//myScanner就是Scanner类的对象
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("名字=" + name);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("年龄="+ age);
        System.out.println("请输入成绩");
        double a = myScanner.nextDouble();
        System.out.println("成绩="+ a);
        char b = myScanner.next().charAt(0);
        //字符就是把字符串的第一个提取出来
        /*
        如果想输入int 变量就必须是int类型
        double也是一样
        但是String是字符串类型的
         */
        //现在尝试更改Scanner的类的对象
        Scanner abc = new Scanner(System.in);
        System.out.println("请输入名字");
        String name2 = abc.next();
        System.out.println("名字=" + name2);
        //成功可以更改类的对象名
    }
}
