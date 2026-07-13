import com.sun.source.tree.BreakTree;
import java.util.Scanner;
public class 题14 {
    public static void main(String[] args) {
        AA a = new AA();
        Scanner myScanner = new Scanner(System.in);
        int j;
        System.out.println("请输入整数");
        j = myScanner.nextInt();
        a.B(j);
        BB x = new BB();
        int n;
        System.out.println("请输入整数");
        n = myScanner.nextInt();
        if (x.c(n)){                    //布偶变量的判断
            System.out.println("是偶数");
        }else {
            System.out.println("是奇数");
        }
    }

    static class AA {                           //第一版不返回的做法
        int i;

        public void B(double a) {
            if (a % 2 == 0) {
                System.out.println("是偶数");
            } else {
                System.out.println("是奇数");
            }
        }

    }
}
class BB {                                   //第二版返回布尔变量

    public boolean c(int d){
        if (d % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
// return d % 2 == 0;也是可以的直接返回一个布尔变量