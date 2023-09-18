package com.ttk.adapter.classadapter;

/**
 * @Author TTK
 * @Description 目标类
 * @Version 1.0
 */
public class SDCardImpl implements SDCard {

    public String readSD() {
        String msg = "SDCard read msg ： hello word SD";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg ：" + msg);
    }
}
