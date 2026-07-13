public class a18this {
    public static void main(String[] args) {
        A a = new A("夏辰义",18);
        System.out.println(a.age+a.name);
    }
    static class A{
        String name;
        int age;
        public A(String name,int age){//让构造器的变量和对象的属性同名方便编程
            this.age = age;
            this.name = name;
        }
    }
}
/*
this 是一个运行时绑定的特殊关键字，它的值取决于函数的调用方式，而不是定义方式。
核心原则：this 指向的是调用该函数的对象。
核心规则
this = 调用者（谁调用，指向谁）
四大绑定规则
表格
规则	形式	this 指向
默认绑定	foo()	window / undefined（严格模式）
隐式绑定	obj.foo()	obj
显式绑定	foo.call(obj) / bind()	指定的 obj
new 绑定	new Foo()	新创建的实例
箭头函数
无自身 this，继承外层作用域
 */