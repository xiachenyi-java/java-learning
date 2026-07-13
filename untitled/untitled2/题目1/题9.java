public class 题9 {
    public static void main(String[] args) {
        double a = 100000;
        int b = 0;
        while (a >= 1000){
            if (a > 50000){
                a *= 0.95;
                b++;
                continue;
            }
            if (a <= 50000){
                a -= 1000;
                b++;
                continue;
            }
        }
        System.out.println(b);
    }
}
