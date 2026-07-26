package com.A12DataInputStream;

import java.io.*;

/**
 * 夏辰义
 * 2026/7/2615:26
 */
/*
一、数据流 DataInputStream / DataOutputStream
问题：字节流只能读写字节，如果要存一个 int 或 double，需要手动拆成 4 字节/8 字节，很麻烦。
解决：数据流直接读写基本数据类型。
顺序不能变
 */
public class T1 {
    public static void main(String[] args) {
        String file = "D:/test/data.bin";
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            dos.writeInt(200);
            dos.writeUTF("你好");
            dos.writeDouble(2.5);
        }catch (Exception e){
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(new FileInputStream(file)))){
            int i = dis.readInt();
            String s = dis.readUTF();
            double d = dis.readDouble();
            System.out.println(i + s + d);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
