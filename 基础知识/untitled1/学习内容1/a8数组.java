public class a8数组 {
    public static void main(String[] args) {
        double[] b = {1,5,25,62,62};
        //创建一个数组，int也行
        double[] c = new double[6];
        //定义一个数组
        double[] d;
        d = new double[6];
        //声明一个数组，然后再定义
        double a = 0;
        int i;
        for ( i = 0; i < 5; i++ ){
            // 历遍数组时不能超过数组
            a += b[i];
        }
        System.out.println(a);
    }
}
//public class 数组应用 {
//    public static void main(String[] args) {
//        // 1. 二维数组：存储学生成绩表
//        int[][] 成绩表 = {
//            {85, 90, 78},  // 学生1的3科成绩
//            {92, 88, 95},  // 学生2
//            {76, 85, 80}   // 学生3
//        };
//
//        System.out.println("学生2的第3科成绩：" + 成绩表[1][2]); // 95
//
//        // 2. 数组作为参数：计算平均分
//        int[] 学生1成绩 = {85, 90, 78};
//        double 平均分 = 计算平均分(学生1成绩);
//        System.out.println("学生1平均分：" + 平均分);
//
//        // 3. Arrays工具类
//        int[] 数组 = {5, 2, 8, 1, 9};
//        Arrays.sort(数组);  // 自动排序
//        System.out.println("排序后：" + Arrays.toString(数组)); // [1, 2, 5, 8, 9]
//    }
//
//    // 数组作为方法参数
//    public static double 计算平均分(int[] 分数数组) {
//        int 总和 = 0;
//        for (int 分数 : 分数数组) {
//            总和 += 分数;
//        }
//        return (double) 总和 / 分数数组.length;
//    }
//}