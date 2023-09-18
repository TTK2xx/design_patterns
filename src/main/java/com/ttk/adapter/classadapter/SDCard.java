package com.ttk.adapter.classadapter;

/**
 * @Author TTK
 * @Description 目标接口
 * @Version 1.0
 */
public interface SDCard {

    //从SD卡中读取数据
    String readSD();
    //往SD卡中写数据
    void writeSD(String msg);
}
