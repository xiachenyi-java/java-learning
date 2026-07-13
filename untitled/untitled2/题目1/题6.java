import java.util.Scanner;
public class 题6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
                System.out.println("请输入年份");
                int a = myScanner.nextInt();
                if (a%4==0&&a%100!=0||a%400==0){    //或者||和与&&
                    System.out.println("是闰年");
                }
                else {
                    System.out.println("不是闰年");
                }
    }
}
