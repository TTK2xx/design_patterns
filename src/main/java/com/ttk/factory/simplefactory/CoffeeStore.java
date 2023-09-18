package com.ttk.factory.simplefactory;

import com.ttk.factory.simplefactory.Coffee;
import com.ttk.factory.simplefactory.SimpleCoffeeFactory;

/**
 * @Author TTK
 * @Description 咖啡店，用来提供咖啡
 * @Version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }
}
