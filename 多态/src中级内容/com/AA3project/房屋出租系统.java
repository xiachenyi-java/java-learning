package com.AA3project;


public class 房屋出租系统 {
    public void Run(){
        A1 a1 = new A1();
        int i;
        a1.Menu();
        while (true){
            System.out.println("请选择1-6");
            i = a1.MyScanner.nextInt();
            a1.MyScanner.nextLine();  // 吃掉换行符
            switch (i){
                case 1:
                    a1.Add_a_house();
                    break;
                case 2:
                    a1.Search_for_properties();
                    break;
                case 3:
                    a1.Delete_property();
                    break;
                case 4:
                    a1.Modify_the_property();
                    break;
                case 5:
                    a1.List_of_Houses();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入错误请重新输入");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new 房屋出租系统().Run();
    }
}
