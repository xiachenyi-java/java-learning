package com.A5Interface;

public class Camera implements  UsbInterface {
    @Override
    public void start(){
        System.out.println("相机开始工作");
    }
    public void stop(){
        System.out.println("相机停止工作");
    }
}
