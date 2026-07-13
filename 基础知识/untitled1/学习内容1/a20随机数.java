import java.util.Random;
public class a20随机数 {
    public static void main(String[] args) {
            Random r = new Random();
            int num = r.nextInt(22);  // 每次只生成 0、1 或 2 中的一个
            System.out.println(num);
        }
    }

