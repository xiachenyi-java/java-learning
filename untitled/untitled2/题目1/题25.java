public class 题25 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.A1(2));
        System.out.println(a.A2(3));
    }
    static class A{
        double a =3.14;
        public double A1(int i){
            return 2*a*i;
        }
        public double A2(int i){
            return a*i*i;
        }
    }
}
//在 Java 中，Math.PI 是 java.lang.Math 类中定义的一个常量，表示圆周率 π 的值。