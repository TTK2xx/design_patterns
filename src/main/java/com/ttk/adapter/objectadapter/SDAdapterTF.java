package com.ttk.adapter.objectadapter;


import com.ttk.adapter.classadapter.SDCard;
import com.ttk.adapter.classadapter.TFCardImpl;

/**
 * @Author TTK
 * @Description 适配器
 * @Version 1.0
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
