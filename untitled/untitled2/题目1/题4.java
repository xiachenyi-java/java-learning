import java.util.Scanner;
public class 题4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        double c = a+b;
        if (a>10&&b<20){           //与
            System.out.println("两数之和为" +c);
        }

    }
}
//c可以改为(a+b)