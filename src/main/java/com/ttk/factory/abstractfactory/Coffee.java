package com.ttk.factory.abstractfactory;

/**
 * @Author TTK
 * @Description 咖啡类
 * @Version 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addsugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
