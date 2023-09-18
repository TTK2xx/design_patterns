package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 快餐类(抽象构件角色)
 * @Version 1.0
 */

public abstract class FastFood {

    private float price;//价格
    private String desc; //描述

    // get set
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // 构造方法
    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }
    // 抽象的，计算价格的方法
    public abstract float cost();
}
