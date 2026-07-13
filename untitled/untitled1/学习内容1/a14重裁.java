public class a14重裁 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.A1(1,2,6));
        System.out.println(a1.A1(1,2));
        System.out.println(a1.A1(1,2.8));
    }
    static class A{
        public int A1(int i,int j){
            return i + j;
        }//两个整数
        public double A1(int i,double j){
            return i + j;
        }//一个整数一个小数
        public double A1(double i,int j){
            return  i + j;
        }//互换位置
        public double A1(double i, double j,double m){
            return i + j + m;
        }//四个方法构成了重裁
    }
}
/*
1.方法名相同
2.形参的类型，必须不一样，（类型不一样，个数不一样，顺序不一样）
3.返回值无要求
 */
/*
定义	同一类中，多个方法同名但参数列表不同
作用	用统一的方法名处理不同类型/数量的参数
规则	参数类型、个数或顺序至少一个不同；返回类型不影响
特点	编译时确定调用哪个（静态绑定）
本质	多个独立的方法
 */