import java.util.Arrays;

public class a21自动排序 {
    public static void main(String[] args) {
        int[] a = {4,12,52,1,23,74};
        Arrays.sort(a);//自动升序
    }
}
/*
Arrays.sort(a) 本身不返回值	它是原地排序，直接修改数组 a
打印数组要用 Arrays.toString(a)	直接 System.out.println(a) 会输出哈希地址
排序结果永远是升序	基本类型数组不支持直接降序
 */