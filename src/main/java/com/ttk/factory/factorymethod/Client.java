package com.ttk.factory.factorymethod;

/**
 * @Author TTK
 * @Description 测试工厂方法模式
 *   1）定义：定义一个用于创建对象的接口(CoffeeFactory)，让子类(AmericanCoffeeFactory和LatteCoffeeFactory)决定实例化哪个产品类对象。
 *      工厂方法使一个产品类的实例化延迟到其工厂的子类。
 *   2）工厂方法模式的主要角色：
 *      - 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。
 *      - 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 *      - 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 *      - 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 *   3）优点：
 *      - 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 *      - 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *   4）缺点：
 *      - 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 *
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //创建工厂对象
        //CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        //点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
