public class 题23 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.A1(55));
    }
    static class A{
        public int A1(int i){
            if (i > 150){
                i = 150;
                return i;
            }else if (i < 100){
                i = 100;
                return i;
            }else {
                return i;
            }
        }
    }
}
/*
方法逻辑总结
A1 方法实际上是一个数值限制器：
输入值 > 150 → 返回 150（上限限制）
输入值 < 100 → 返回 100（下限限制）
100 ≤ 输入值 ≤ 150 → 原值返回
等价于：return Math.max(100, Math.min(150, i))
 */
