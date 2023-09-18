package com.ttk.factory.factorymethod;

/**
 * @Author TTK
 * @Description 美式咖啡工厂，专门生产美式咖啡
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
