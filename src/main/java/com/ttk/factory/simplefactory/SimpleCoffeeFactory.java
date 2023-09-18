package com.ttk.factory.simplefactory;

/**
 * @Author TTK
 * @Description 简单工厂类 不是23中设计模式中的
 *      1) 优点：
 *          封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避
 *          免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户
 *          代码修改的可能性，更加容易扩展。
 *      2) 缺点：
 *          增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。
 * @Version 1.0
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        return coffee;
    }
}

