package com.ttk.factory.before;

/**
 * @Author TTK
 * @Description 测试点咖啡
 *      如果创建的时候直接new该对象，就会对该对象耦合严重（CoffeeStore和XxxCoffee耦合），假如我们要更换对象，
 *      所有new对象的地方都需要修改一遍（CoffeeStore里面的orderCoffee()方法需要修改），这显然违背了软件设计
 *      的开闭原则。如果我们使用工厂来生产对象，我们就只和工厂打交道就可以了，彻底和对象解耦，如果要更换对象，直
 *      接在工厂里更换该对象即可，达到了与对象解耦的目的；所以说，工厂模式最大的优点就是：解耦。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1,创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        //2,点咖啡
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}
