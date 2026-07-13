public class a19字符串比较 {
    public static void main(String[] args) {
        System.out.println("夏辰义".equals("夏辰义"));
    }
}
/*
特性	        ==	    equals()
本质	       运算符	方法
基本类型	✅ 比较值	❌ 不能用
引用类型默认	比较地址	比较地址（Object默认）
引用类型（如String）	比较地址	比较内容（已重写）
是否需要重写	不需要	自定义类通常需要
一句话总结
== 问的是"你们是不是同一个人？"
equals 问的是"你们长得是不是一样？"
比较基本类型用 ==
比较对象内容用 equals（前提是类已正确重写）
比较对象身份（是否同一对象）用 ==
 */