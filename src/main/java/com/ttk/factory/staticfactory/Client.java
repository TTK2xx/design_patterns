package com.ttk.factory.staticfactory;

/**
 * @Author TTK
 * @Description 测试点咖啡
 *      静态工厂和简单工厂相差不大，只是把SimpleCoffeeFactory里面的createCoffee方法变成静态的，
 *      在CoffeeStore中不需要创建工厂类，直接调用即可。
 *
 *      好处是如果有多个需要点咖啡的类，不用在每个类里面重复创建工厂对象
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
