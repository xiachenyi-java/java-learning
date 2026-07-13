public class 题18 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.A1("夏辰义" ,97,96,97));
    }
    static  class  A{
        public String A1(String i,double...j ){
            double b = 0;
            for (int c = 0; c < j.length; c++){
                b += j[c];
            }
            return i + "有" +j.length + "门课的总分是" + b;
        }
    }
}
