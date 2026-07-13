public class 题19 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.age);
    }
    static class A{
        String name;
        int age;
        public A(){
            age = 18;
        }
        public A(String Aname,int Aage){
            name = Aname;
            age = Aage;
        }
    }
}
//不加年龄所有的A的对象都是18岁
//无参构造器
