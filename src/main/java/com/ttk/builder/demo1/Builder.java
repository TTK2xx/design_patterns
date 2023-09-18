package com.ttk.builder.demo1;

/**
 * @Author TTK
 * @Description 抽象建造者类
 * @Version 1.0
 */
public abstract class Builder {

    //声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
