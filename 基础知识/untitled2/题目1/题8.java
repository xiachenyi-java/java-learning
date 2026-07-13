public class 题8 {
    public static void main(String[] args) {
             int a,b,i;
             a = 0;b = 0;
             for (i = 1;i < 100;i++){
                 if (i % 9 == 0){
                     a++;
                     b=b+i;
                     System.out.println("9的倍数为"+i);
                 }
             }
             System.out.println("有"+a+ "次");
             System.out.println("和为"+b);
    }
}
