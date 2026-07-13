import java.util.Scanner;
public class 题13 {
    public static void main(String[] args) {
        int[] a = {10, 12, 45, 90};
        int z[] = new int[a.length + 1];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int b = myScanner.nextInt();
        int j = 0;
        boolean inserted = false;

        for (int i = 0; i < 4; i++) {
            if (!inserted && b < a[i]) {
                z[j++] = b;
                inserted = true;
            }
            z[j++] = a[i];
        }

        if (!inserted) {
            z[j++] = b;
        }
        a = z;
        for (int i = 0;i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
