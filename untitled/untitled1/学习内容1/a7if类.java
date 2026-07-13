import java.util.Scanner;
public class a7if类 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if(age>18) {
            System.out.println("你已成年，要对自己的行为负责");
        }
        else {
            System.out.println("你是未成年，不能对自己的行为负责");
        }
    }
}
//if 就是如果怎么样就怎么样
//这个案例是如果大于18就怎么样，没有大于18就怎么样
/*
import java.util.Scanner;

public class IfDetailDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ⑨ 输入校验：防止非整数
        int age;
        while (true) {
            System.out.print("请输入年龄：");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                break;
            } else {
                System.out.println("输入不合法，请重新输入整数！");
                sc.next();          // 清掉错误内容
            }
        }

        // ② 边界：>= 18 才算成年
        // ⑥ 统一加大括号，防止以后加语句出错
        if (age >= 18) {                    // ⑤ 必须是布尔表达式
            System.out.println("你已成年，要对自己的行为负责");
        } else {
            System.out.println("你是未成年，不能对自己的行为负责");
        }

        // ⑦ 三目运算符示例
        String result = (age >= 18) ? "成年" : "未成年";
        System.out.println("三目结果 = " + result);

        sc.close();
    }
}作用域：变量定义位置决定生命周期；不能在条件表达式里再声明。
边界符：判断“成年”用 >= 18，避免18岁整被漏掉。
else配对：总与最近且未配对的 if 结合；多层嵌套务必加 {}。
短路运算：&&、|| 只算一半；&、| 会两边都算。
布尔强制：条件必须是 boolean；不能用 if(age) 代替 if(age!=0)。
单行省略：可省 {}，但后续加语句容易忘→一律保留大括号。
三目替换：String res = age>=18?"成年":"未成年"; 只适用于有返回值场景。
switch场景：等值分支多时用 switch-case，可读性更高。
输入校验：sc.nextInt() 抛 InputMismatchException；先 hasNextInt() 再读。
可读技巧：复杂条件拆方法、用德摩根定律简化 !(a==0 && b==0) → a!=0 || b!=0
 */