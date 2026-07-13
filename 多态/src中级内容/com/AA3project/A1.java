package com.AA3project;

import java.util.Scanner;

public class A1 {
    private String[] Name = new String[100];
    private int[] Telephone = new int[100]; //电话
    private String[] Address = new String[100]; //地址
    private double[] Monthly_Rent = new double[100]; //月租
    private String[] State = new String[100]; //状态
    private int[] ID = new int[100]; //ID
    private int counter = 0; //计数器
    public Scanner MyScanner = new Scanner(System.in);

    public void Menu(){//菜单
        System.out.println("--------------房屋出租系统--------------");
        System.out.println("1: 新 增 房 屋");
        System.out.println("2: 查 找 房 屋");
        System.out.println("3: 删 除 房 屋");
        System.out.println("4: 修 改 房 屋 信 息");
        System.out.println("5: 房 屋 列 表");
        System.out.println("6: 退       出");
    }

    public void Add_a_house(){ //增加房屋
        System.out.println("--------------新增房屋----------------");
        System.out.println("姓名是:" );
        Name[counter] = MyScanner.nextLine();
        System.out.println("电话是:" );
        Telephone[counter] = MyScanner.nextInt();
        MyScanner.nextLine();  // 清除缓冲区残留的换行符
        System.out.println("地址是:");
        Address[counter] = MyScanner.nextLine();
        System.out.println("月租是:" );
        Monthly_Rent[counter] = MyScanner.nextDouble();
        MyScanner.nextLine();  // 清除缓冲区残留的换行符
        System.out.println("状态是:" );
        State[counter] = MyScanner.nextLine();
        System.out.println("房屋ID自动生成");
        System.out.println("--------------新增完成----------------");
        ID[counter] = counter + 1;
        counter++;
    }

    public void Search_for_properties(){ //查找房源
        int i;
        System.out.println("--------------查找房屋----------------");
        System.out.println("请输入房屋编号");
        i = MyScanner.nextInt();
        for (int j = 0; j < counter; j++){
            if(ID[j] == i){
                System.out.println(ID[j] + "\t" + Name[j] + "\t" + Telephone[j] + "\t"
                        + Address[j] + "\t" +  Monthly_Rent[j] + "\t" +State[j]);
                return;
            }
        }System.out.println("--------------没有该房屋---------------");
    }

    public void Delete_property(){//删除房屋
        int i;
        String A;
        System.out.println("--------------删除房屋----------------");
        System.out.println("请选择待删除房屋编号(-1退出)");
        i = MyScanner.nextInt();
        MyScanner.nextLine();  // 吃掉换行符
        if (i == -1){
            return;
        }
        System.out.println("确认是否删除(Y/N):请选择");
        A = MyScanner.nextLine();
        if (A.equals("Y")){
            for (int j = 0; j < counter; j++){
                if (ID[j] == i){
                    for (int a = j; a < counter - 1; a++){
                        Name[a] = Name[a + 1];
                        Telephone[a] = Telephone[a + 1] ;
                        Address[a] = Address[a + 1];
                        Monthly_Rent[a] = Monthly_Rent[a + 1];
                        State[a] = State[a + 1];
                        ID[a] = ID[a+1];
                    }counter--;
                    System.out.println("--------------删除完成----------------");
                    return;
                }
            }System.out.println("没有找到该房屋");
        }else if (A.equals("N")){
            return;
        }else {
            System.out.println("请输入Y/N");
            return;
        }
    }

    public void Modify_the_property(){//修改房源
        int i;
        System.out.println("--------------修改客户----------------");
        System.out.println("请选择待修改的房屋编号(-1退出):");
        i = MyScanner.nextInt();
        MyScanner.nextLine();
        if (i == -1){
            return;
        }
        for (int j = 0; j < counter; j++){
            if (ID[j] == i){
                System.out.println("姓名是:" );
                Name[j] = MyScanner.nextLine();
                System.out.println("电话是:" );
                Telephone[j] = MyScanner.nextInt();
                MyScanner.nextLine();  // 清除缓冲区残留的换行符
                System.out.println("地址是:");
                Address[j] = MyScanner.nextLine();
                System.out.println("月租是:" );
                Monthly_Rent[j] = MyScanner.nextDouble();
                MyScanner.nextLine();  // 清除缓冲区残留的换行符
                System.out.println("状态是:" );
                State[j] = MyScanner.nextLine();
                System.out.println("--------------修改完成----------------");
            }
        }
    }

    public void List_of_Houses(){//房屋列表
        System.out.println("--------------房屋列表----------------");
        System.out.println("编号" + "\t" + "房主" + "\t" + "电话" + "\t" + "地址"
                + "\t" + "月租" + "\t" + "状态");
        for (int i = 0;i < counter; i++){
            System.out.println(ID[i] + "\t" + Name[i] + "\t" + Telephone[i] + "\t"
                    + Address[i] + "\t" + Monthly_Rent[i] + "\t" + State[i]);
        }
        System.out.println("--------------房屋列表完成---------------");
    }
}
