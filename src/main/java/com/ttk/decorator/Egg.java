package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 鸡蛋类(具体的装饰者角色)
 * @Version 1.0
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    public float cost() {
        //计算价格
        return super.getPrice() + super.getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getFastFood().getDesc();
    }
}
