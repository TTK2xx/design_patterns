package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 培根类(具体的装饰者角色)
 * @Version 1.0
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood,2,"培根");
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
