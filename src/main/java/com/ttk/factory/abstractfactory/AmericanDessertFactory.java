package com.ttk.factory.abstractfactory;

/**
 * @version v1.0
 * @ClassName: AmericanDessertFactory
 * @Description:
 *         没事风味的甜品工厂
 *             生产美式咖啡和抹茶慕斯
 * @Author: 黑马程序员
 */

/**
 * @Author TTK
 * @Description 具体工厂类
 *      美式风味的甜品工厂
 *            生产美式咖啡和抹茶慕斯
 * @Version 1.0
 */

public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
