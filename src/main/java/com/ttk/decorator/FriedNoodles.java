package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 炒面(具体构件角色)
 * @Version 1.0
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12,"炒面");
    }

    public float cost() {
        return getPrice();
    }
}
