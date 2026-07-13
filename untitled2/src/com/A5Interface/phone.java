package com.A5Interface;

public class phone implements UsbInterface{
    //phone类实现usbinterface
    @Override
    public void start(){
        System.out.println("手机开始工作");
    }
    public void stop(){
        System.out.println("手机停止工作");
    }
}
