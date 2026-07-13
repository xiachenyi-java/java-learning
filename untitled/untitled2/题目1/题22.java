public class 题22 {
    public static void main(String[] args) {
        String b[] = {"A","b","C"};
        A a = new A();
        System.out.println(a.A1(b));
    }
    static class A{
        public char A1(String a[]){
            for (int i = 0;i < a.length;i++){
                if (a[i].equals('A')){
                    return 'A';
                }else {
                }
            }return '1';
        }
    }
}
/*
a[i] 是 String 类型（如 "A"）
'A' 是 char 类型
应该使用 a[i].equals("A") 或 a[i].charAt(0) == 'A'
 */

