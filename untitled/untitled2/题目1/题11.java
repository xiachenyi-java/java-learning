import java.util.Scanner;
public class 题11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double a[] =new double[5];
        for ( int i =0 ; i < 6 ; i++){
            System.out.println("请输入第" + i + "个数");
             a[i] = myScanner.nextDouble();
            System.out.println("第" + i + "个数为" + a[i]);
        }
    }
}
