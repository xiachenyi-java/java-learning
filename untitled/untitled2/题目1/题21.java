public class 题21 {
    public static void main(String[] args) {
        double[] b = {2,41,51,16,62,623,62};
        A a = new A();
        System.out.println(a.max(b));
    }
    static class  A{
        public double max(double a[]){
            if (a == null || a.length == 0) {
                throw new IllegalArgumentException("数组不能为空");//抛出非法参数异常，终止程序并提示错误
            }
            for (int i = 0;i < a.length - 1;i++){  //这段代码试图找出数组中的最大值，但存在 数组越界异常
                if (a[0] <= a[i+1]){
                    a[0] = a[i+1];
                }
            }return a[0];
        }
    }
}
/*
不要修改原数组：原代码直接修改 a[0]，副作用明显，建议用局部变量存储最大值
空数组检查：建议添加 if (a == null || a.length == 0) 的边界检查
使用 Java 8 Stream（更现代)
 */