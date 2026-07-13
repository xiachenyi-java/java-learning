public class a11循环退出 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                continue;  // 跳过i=3
            }
            System.out.println(i);
        }//continue不会退出循环，而是跳过当前迭代，继续下一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // 当i=3时退出循环
            }
            System.out.println(i);
    }//break直接退出循环
   }
}
/*
break	立即退出当前循环	找到目标后终止搜索
continue	跳过本次循环，继续下次	过滤不符合条件的项
break label	退出指定标签的循环	嵌套循环中一次性退出多层
return	退出整个方法	方法内循环完成任务后返回
 */