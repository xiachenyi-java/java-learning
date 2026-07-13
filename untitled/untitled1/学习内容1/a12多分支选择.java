import java.util.Scanner;
public class a12多分支选择 {
        public static void main(String[] args) {
            System.out.println("=== 计算器菜单 ===");
            System.out.println("1. 加法");
            System.out.println("2. 减法");
            System.out.println("3. 乘法");
            System.out.println("4. 除法");

            System.out.print("请选择操作（1-4）：");
            int 选择 = new Scanner(System.in).nextInt();

            switch (选择) {
                case 1:
                    System.out.println("执行加法");
                    // 调用加法方法...
                    break;  // ⚠️ 必须有break，否则会继续执行case 2
                case 2:
                    System.out.println("执行减法");
                    break;
                case 3:
                    System.out.println("执行乘法");
                    break;
                case 4:
                    System.out.println("执行除法");
                    break;
                default:
                    System.out.println("无效选择！请输入1-4");
                    break;
            }
        }
    }
    //int x = 1;
//switch(x) {
//    case 1: System.out.println("一");  // 没写break！
//    case 2: System.out.println("二");  // 会继续执行到这里
//    case 3: System.out.println("三");  // 继续执行到这里
//}
//// 输出：
//// 一
//// 二
//// 三  （这不是我们想要的效果！
//当有 多个固定选项 时，比写一堆 if-else 更清晰
