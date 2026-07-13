public class 题20 {
    public static void main(String[] args) {
        A a1 = new A("夏辰义",18);
        A a2 = new A("夏辰义",18);
        A a3 = new A("廖玉麒",22);
        // 调用比较方法
        System.out.println("a1和a2是否相同: " + a1.A1(a2));  // true
        System.out.println("a1和a3是否相同: " + a1.A1(a3));  // false
    }
    static class A{
        String name;
        int age;
        public A(String name, int age){
            this.name = name;
            this.age = age;
        }
        public boolean A1(A a){
            if (this.name == a.name && this.age== a.age){
                return true;
            }else {
                return false;
            }
        }
    }
}
