package com.ttk.builder.demo1;

/**
 * @Author TTK
 * @Description 指挥者类
 * @Version 1.0
 */
public class Director {

    //声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
