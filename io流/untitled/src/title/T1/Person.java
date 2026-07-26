package title.T1;

import java.io.Serial;
import java.io.Serializable;

/**
 * 夏辰义
 * 2026/7/2615:50
 */
public class Person implements Serializable {//可序列化
    @Serial//作用：告诉编译器"这个字段/方法是序列化机制专用的"。
    private static final long serialVersionUID = 1L;
    private String name;
    private String phone;
    private int age;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString(){
        return "姓名="+ name + "\n手机号=" + phone + "\n年龄=" + age;
    }
}
