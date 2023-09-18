package com.ttk.factory.factorymethod;

/**
 * @Author TTK
 * @Description 拿铁咖啡工厂，专门生产拿铁咖啡
 * @Version 1.0
 */

public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
