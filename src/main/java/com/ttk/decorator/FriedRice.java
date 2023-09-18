package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 炒饭(具体构件角色)
 * @Version 1.0
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10,"炒饭");
    }

    public float cost() {
        return getPrice();
    }
}
