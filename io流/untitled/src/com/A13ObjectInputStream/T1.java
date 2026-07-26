package com.A13ObjectInputStream;

/**
 * 夏辰义
 * 2026/7/2615:38
 */
import java.io.*;

// 必须实现 Serializable，否则抛 NotSerializableException
class User implements Serializable {
    private static final long serialVersionUID = 1L;  // 版本号，下面讲

    String name;
    int age;
    transient String password;  // transient：不参与序列化

    User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class T1 {
    public static void main(String[] args) {
        String file = "D:/test/user.obj";
        User user = new User("张三", 20, "123456");

        // ====== 序列化：对象 → 文件 ======
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(file))) {

            oos.writeObject(user);
            System.out.println("序列化完成: " + user);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ====== 反序列化：文件 → 对象 ======
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(file))) {

            User u = (User) ois.readObject();  // 返回 Object，需要强转
            System.out.println("反序列化结果: " + u);
            // 注意：password 是 null，因为被 transient 修饰

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
2. serialVersionUID（面试重点）
private static final long serialVersionUID = 1L;
作用：序列化的版本号。反序列化时，JVM 会检查文件中的 serialVersionUID 和当前类的 serialVersionUID 是否一致。
如果不写：JVM 会根据类的结构自动生成一个。一旦你修改了类（比如加了个字段），自动生成的 UID 就变了，导致旧文件无法反序列化，抛 InvalidClassException。
最佳实践：手动指定一个固定的 serialVersionUID，兼容旧数据。
3. transient 关键字
被 transient 修饰的字段不会参与序列化：
敏感信息（密码、密钥）
临时计算结果
不可序列化的对象引用
 */