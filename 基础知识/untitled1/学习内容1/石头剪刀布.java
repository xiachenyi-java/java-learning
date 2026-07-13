import java.util.Random;
import java.util.Scanner;
public class 石头剪刀布 {//0是石头1是剪刀2是布
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random r = new Random();
        A a = new A();
        for (int i = 0; i < 5; i++){
            int num = r.nextInt(3);// 每次只生成 0、1 或 2 中的一个
            System.out.println("请输入石头剪刀布0=石头, 1=剪刀, 2=布");
            int num1 = myScanner.nextInt();
            a.A1(num1,num);
            a.A2();
        }
        a.A3();
        myScanner.close();//myScanner.close() 是关闭 Scanner 对象，释放它占用的系统资源
    }
    static class A{
        double[] sj = {0,0,0};//赢平输
        public void A1(int i,int j){
            if (i == 0 && j == 0){
                sj[1]++;
                System.out.println("可惜平局");
            }else if (i == 0 && j == 1){
                sj[0]++;
                System.out.println("恭喜获胜");
            }else if (i == 0 && j == 2){
                sj[2]++;
                System.out.println("遗憾失败");
            }else if (i == 1 && j == 0){
                sj[2]++;
                System.out.println("遗憾失败");
            }else if (i == 1 && j == 1){
                sj[1]++;
                System.out.println("可惜平局");
            }else if (i == 1 && j == 2){
                sj[0]++;
                System.out.println("恭喜获胜");
            }else if (i == 2 && j == 0){
                sj[0]++;
                System.out.println("恭喜获胜");
            }else if (i == 2 && j == 1){
                sj[2]++;
                System.out.println("遗憾失败");
            }else if (i == 2 && j == 2){
                sj[1]++;
                System.out.println("可惜平局");
            }
        }
        public void A2(){
            System.out.println("+-------------------+");
            System.out.println("目前胜率为="+sj[0]/(sj[0]+sj[1]+sj[2]));
            System.out.println("+-------------------+");

        }
        public void A3() {
            System.out.println("\n========== 游戏结束 ==========");
            double total = sj[0] + sj[1] + sj[2];
            double rate = total > 0 ?  sj[0] / total * 100 : 0;
            System.out.printf("最终战绩：赢 平 输", sj[0], sj[1], sj[2]);
            System.out.printf("总胜率：%.1f%%\n", rate);

            // 评价
            if (rate >= 60) {
                System.out.println("评价：高手！");
            } else if (rate >= 40) {
                System.out.println("评价：还行~");
            } else {
                System.out.println("评价：再接再厉！");
            }
            System.out.println("============================");
        }
    }
}
/*
这个胜负逻辑可以总结
if全部赢
elesif相同
eles就是输
 */