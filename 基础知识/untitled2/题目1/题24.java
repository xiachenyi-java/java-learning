public class 题24 {
    public static void main(String[] args) {
        A a = new A();
        int[] b = {1,421,42,51,1};
        System.out.println(a.A1(b));
    }
    static class A{
        int[] a;
        public int[] A1(int[] a){
            this.a = new int[a.length];  // 先初始化数组
            for (int i = 0;i < a.length;i++){
                this.a[i] = a[i];
            }
            return this.a;
        }
    }
}
/*
Java 空指针异常（NullPointerException）
你写了一个类 A，其中的方法 A1 试图将传入的数组赋值给成员变量 this.a，
但忘记初始化数组就直接使用 this.a[i] 进行赋值操作。
核心错误
java
复制
int[] a;  // 声明了引用，但未初始化（默认为 null）

this.a[i] = a[i];  // 对 null 引用进行访问 → 空指针异常
修复要点
必须先初始化数组：this.a = new int[a.length];
修正循环边界：原代码 a.length-1 会漏掉最后一个元素，应为 a.length

 */