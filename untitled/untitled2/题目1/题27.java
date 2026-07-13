public class 题27 {
    public static void main(String[] args) {
        A a = new A("小白","白" ,5);
        a.A1();
    }
    static class A{
        String name;
        String color;
        int age;
        public A(String name,String color,int age){
            this.age = age;
            this.color = color;
            this.name = name;
        }
        public void A1(){
            System.out.println("名字是" + name);
            System.out.println("颜色是" + color);
            System.out.println("年龄是" + age);
        }
    }
}
