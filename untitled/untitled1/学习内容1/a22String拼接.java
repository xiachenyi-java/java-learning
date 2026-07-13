public class a22String拼接 {
    public static void main(String[] args) {
        String a = "你";
        String b = "好";
        String c =a+b;
        System.out.println(c);
        //String 拼接就是把多个字符串连在一起，有几种方式：
        //一、用 + 号拼接（最常用）
        String c1 ="";
        c1 += "第一行\n";
        c1 += "第二行\n";
        c1 += "第三行";
        System.out.println(c1);
        int d = 100;
        String D = "钱" + d;
        System.out.println(D);
    }
}
/*
符号	作用
+	拼接字符串
+=	累加拼接
\n	换行符
String.format("%.2f", num)	数字保留2位小数
 */
