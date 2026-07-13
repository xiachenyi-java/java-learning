package com.A5Interface;

public class Computer {
    public void work(UsbInterface usbInterface){
        //规定接口方法
        //通过接口调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
