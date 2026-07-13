public class 题26 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        System.out.println(a.A1(3, 51));
        System.out.println(a.A2(3, 51));
        System.out.println(a.A3(3, 51));
        System.out.println(a.A4(3, 51));
        System.out.println(a1.A1(3, 51));
        System.out.println(a1.A2(3, 51));
        System.out.println(a1.A3(3, 51));
        System.out.println(a1.A4(3, 0));

    }

    static class A {
        public double A1(double i, double j) {
            return i + j;
        }

        public double A2(double i, double j) {
            return i - j;
        }

        public double A3(double i, double j) {
            return i * j;
        }

        public Double A4(double i, double j) {
            if (j == 0) {
                System.out.println("除数为0");
                return null; //返回空
            }
            return i / j;
        }
    }
}