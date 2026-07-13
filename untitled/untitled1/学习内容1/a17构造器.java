public class a17构造器 {
    public static void main(String[] args) {
        A a = new A("夏辰义",18);
    }
    static class A{
        String name;
        int age;
//构造器和对象必须同名，无返回值，void也不行
        public A(String Aname, int Aage){
            System.out.println("构造器被调用，完成对象的初始化");
            name = Aname;
            age = Aage;
            System.out.println("a对象的名字是" + name + '\n' + "年龄是" + age);
        }
    }
    //class B{
        //public B{
        //    //这就是无参构造器
        //}
    //}
}
/*
构造器是特殊的方法，用于创建对象时初始化实例变量。
特点：
方法名与类名完全相同
没有返回值类型（连void都不能写）
通过new关键字调用
未定义时，编译器自动生成默认无参构造器
| 类型    | 说明                  |
| :---- | :------------------ |
| 无参构造器 | 不带参数，基本初始化          |
| 有参构造器 | 带参数，指定初始值           |
| 默认构造器 | 编译器自动生成（仅当无自定义构造器时） |
| 语法      | 作用                 | 限制            |
| :------ | :----------------- | :------------ |
| this()  | 调用本类其他构造器          | 必须是第一条语句      |
| super() | 调用父类构造器            | 必须是第一条语句      |
| 默认      | 子类构造器首行默认调用super() | 不能与this()同时存在 |
定义有参构造器后，默认无参构造器消失
构造器可设为private（单例模式）
构造器不能递归调用
构造器不能被继承
 */
