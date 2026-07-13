public class 题12 {
    public static void main(String[] args) {
        int[] b = {4,-1,9,10,23};
        int a = 0;
        for (int i = 0 ; i <5 ; i++){
            if ( b[a] < b[i]){
                a = i;
            }
        }
        System.out.println("最大值为" +b[a]+ "下标为" + a);
    }
}
