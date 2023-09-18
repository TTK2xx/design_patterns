package com.ttk.adapter.objectadapter;

/**
 * @Author TTK
 * @Description 适配者
 * @Version 1.0
 */
public class TFCardImpl implements TFCard {

    public String readTF() {
        String msg = "TFCard read msg ： hello word TFcard";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
