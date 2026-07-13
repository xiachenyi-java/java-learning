import java.util.Scanner;
public class 题16 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "夏辰义";
        p.age = 20;
        A a = new A();             //一定要接收创建的新类
        Person p1 = a.copyPerson(p);        //虽然 copyPerson 方法内部创建了 p1 并返回它，但你没有将返回的 Person 对象赋值给任何变量。这个返回的对象没有被使用，所以 p1 确实"无意义"——它刚创建就被垃圾回收了。
        System.out.println("克隆人名" + p1.name + " " + "克隆人年龄" + p1.age);
        System.out.println("我的名" +p.name + " " + "我的年龄" + p.age );
    }
    static class Person{
        String name;
        int age;
    }
    static class A{
        public Person copyPerson(Person p){
            Person p1 = new Person();
            p1.age = p.age;
            p1.name = p.name;
            return p1;
        }
    }
}
