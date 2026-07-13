import java.util.Scanner;

public class 题5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = a + b;
        if (c % 3 == 0 && c % 5 == 0) {     //与
            System.out.println("能被3和5整除");
        } else {
            System.out.println("不能被3和5整除");
        }
    }
}
