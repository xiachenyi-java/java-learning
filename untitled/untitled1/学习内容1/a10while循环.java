import java.util.Scanner;
public class a10while循环 {
        public static void main(String[] args) {
            int 答案 = 50;  // 心里想的数字
            int 猜测值;

            do {  // do-while：至少执行一次
                System.out.print("猜一个0-100的数字：");
                猜测值 = new Scanner(System.in).nextInt();

                if (猜测值 > 答案) {
                    System.out.println("太大了！");
                } else if (猜测值 < 答案) {
                    System.out.println("太小了！");
                }
            } while (猜测值 != 答案);  // 猜不对就一直循环

            System.out.println("恭喜你，猜对了！");
        }
    }