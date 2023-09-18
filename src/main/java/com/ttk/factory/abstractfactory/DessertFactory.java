package com.ttk.factory.abstractfactory;

/**
 * @Author TTK
 * @Description 抽象甜品工厂
 * @Version 1.0
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
