package title.T1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


/**
 * 夏辰义
 * 2026/7/2617:53
 */
public class AddressBookApp {
    private static final String FILE = "D:/test/addressbook.dat";

    public static void main(String[] args) {
        List<Person> list = loadFromFile();
        Scanner MyScanner = new Scanner(System.in);
        while (true){
            System.out.println("======== 通讯录系统 ========\n" +
                    "1. 添加联系人\n" +
                    "2. 删除联系人\n" +
                    "3. 修改联系人\n" +
                    "4. 查询联系人\n" +
                    "5. 显示全部\n" +
                    "0. 退出并保存\n" +
                    "==========================");
            int choice = MyScanner.nextInt();
            MyScanner.nextLine();
            switch (choice){
                case 1: addPerson(list, MyScanner); break;
                case 2: deletePerson(list, MyScanner); break;
                case 3: updatePerson(list, MyScanner); break;
                case 4: queryPerson(list, MyScanner); break;
                case 5: showAll(list); break;
                case 0:
                    saveToFile(list);  // 退出前保存
                    System.out.println("已保存，再见！");
                    return;
                default: System.out.println("无效选项");
            }
        }
    }
    static List<Person> loadFromFile(){
        File file = new File(FILE);
        if (!file.exists()){
            return new ArrayList<>();
        }try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            return (List<Person>) ois.readObject();
        }catch (Exception e){
            System.out.println("加载失败，使用空列表");
            return new ArrayList<>();
        }
    }
    static void saveToFile(List<Person> list){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(FILE)))) {

            oos.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void addPerson(List<Person> list,Scanner MyScanner){
        System.out.print("请输入姓名：");
        String name = MyScanner.nextLine();

        System.out.print("请输入电话：");
        String phone = MyScanner.nextLine();

        System.out.print("请输入年龄：");
        int age = MyScanner.nextInt();
        MyScanner.nextLine();  // 吃掉换行

        Person p = new Person(name, phone, age);
        list.add(p);

        System.out.println("添加成功！");
    }
    static void deletePerson(List<Person> list,Scanner MyScanner){
        System.out.print("请输入要删除的姓名：");
        String name = MyScanner.nextLine();
        for (int i = 0;i < list.size();i++){
            if (Objects.equals(name, list.get(i).getName())){
                list.remove(i);
            }else {
                System.out.println("此人不存在");
            }
        }
    }
    static void updatePerson(List<Person> list, Scanner MyScanner){
        System.out.print("请输入要修改的姓名：");
        String name = MyScanner.nextLine();
        for (int i = 0;i < list.size();i++){
            if (Objects.equals(name, list.get(1).getName())){
                System.out.print("请输入姓名：");
                list.get(i).setName(MyScanner.nextLine());
                MyScanner.nextLine();
                System.out.print("请输入电话：");
                list.get(i).setPhone(MyScanner.nextLine());
                MyScanner.nextLine();
                System.out.print("请输入年龄：");
                list.get(i).setAge(MyScanner.nextInt());
                MyScanner.nextLine();
                System.out.print("修改成功");
            }else {
                System.out.println("此人不存在");
            }
        }
    }
    static void queryPerson(List<Person> list, Scanner MyScanner){
        System.out.print("请输入要查询的姓名：");
        String name = MyScanner.nextLine();
        for (int i = 0;i < list.size();i++){
            if (Objects.equals(name, list.get(i).getName())){
                list.get(i).toString();
            }else {
                System.out.println("此人不存在");
            }
        }
    }
    static void showAll(List<Person> list){
        if (list.isEmpty()){
            System.out.println("通讯录为空");
            return;
        }
        for (Person p : list) {
            System.out.println(p);  // 依赖 toString()
        }
    }
}
