package com.ttk.adapter.objectadapter;

/**
 * @Author TTK
 * @Description
 * @Version 1.0
 */
public class Computer {

    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw  new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
