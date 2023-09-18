package com.ttk.factory.abstractfactory;

/**
 * @Author TTK
 * @Description 具体工厂类
 *      意大利风味甜品工厂
 *          生产拿铁咖啡和提拉米苏甜品
 * @Version 1.0
 */

public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
