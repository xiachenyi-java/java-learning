public class 题17 {
    public static void main(String[] args) {
        A a = new A();
        a.m(4);
        a.m(5,34);
        a.m("夏辰义");
    }
    static class A{
        public void m(int i){
            i *= i;
           System.out.println("方法m的平方为"+i);
        }
        public void m(int i,int j){
            i *= j;
            System.out.println("方法m的相乘为"+i);
        }
        public void m(String i){
            System.out.println("方法m的字符串为"+i);
        }
    }
}
