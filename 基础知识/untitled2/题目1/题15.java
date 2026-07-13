public class 题15 {
    public static void main(String[] args) {
        A a = new A();
        a.A1(25,25,'*');        //字符要带’‘
    }
    static class A{
        public void A1( int i, int j, char n){
            for (int a = 0; a < i; a++){
                for (int b = 0; b < j; b++){    //输出每一行
                    System.out.print(n);        //println 中的 ln 就是 line 的缩写，表示"行"，所以输出后会换到下一行
                }
               System.out.println();      //换行
            }

        }
    }
}
