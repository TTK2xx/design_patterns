package com.ttk.adapter.classadapter;


/**
 * @Author TTK
 * @Description 适配器
 * @Version 1.0
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
