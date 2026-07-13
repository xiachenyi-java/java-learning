import java.util.Scanner;
public class 题7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份和年龄");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        if (a >= 4 && a <= 10) {
            if (b <= 60 && b >= 18) {
                System.out.println("60");
            } else if (b < 18) {
                System.out.println("30");
            } else {
                System.out.println("20");
            }
        } else {
            if (b <= 60 && b >= 18) {
                System.out.println("40");
            } else {
                System.out.println("20");
            }
        }
    }
}
