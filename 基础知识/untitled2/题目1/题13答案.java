import java.util.Scanner;
public class 题13答案 {
    public static void main(String[] args) {
        int[] a = {10, 12, 45, 90};
        int[] result = new int[a.length + 1];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int b = myScanner.nextInt();

        int i = 0;
        int j = 0;

        // 找到插入位置
        while (i < a.length && a[i] < b) {
            result[j++] = a[i++];
        }

        // 插入新元素
        result[j++] = b;

        // 复制剩余元素
        while (i < a.length) {
            result[j++] = a[i++];
        }

        // 输出结果
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}