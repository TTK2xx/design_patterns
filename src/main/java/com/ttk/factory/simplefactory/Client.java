package com.ttk.factory.simplefactory;

/**
 * @Author TTK
 * @Description 测试点咖啡
 *      简单工厂包含如下角色：
 *          抽象产品 ：定义了产品的规范，描述了产品的主要特性和功能。Coffee
 *          具体产品 ：实现或者继承抽象产品的子类 AmericanCoffee和LatteCoffe
 *          具体工厂 ：提供了创建产品的方法，调用者通过该方法来获取产品。SimpleCoffeeFactory
 *
 *      工厂（factory）处理创建对象的细节，一旦有了SimpleCoffeeFactory，CoffeeStore类中的
 *      orderCoffee()就变成此对象的客户，后期如果需要Coffee对象直接从工厂中获取即可。这样也就
 *      解除了和Coffee实现类的耦合。
 *
 *      同时又产生了新的耦合，CoffeeStore对象和SimpleCoffeeFactory工厂对象的耦合，工厂对象
 *      和商品对象的耦合。后期如果再加新品种的咖啡，我们势必要需求修改SimpleCoffeeFactory的代
 *      码，违反了开闭原则。
 *
 *      工厂类的客户端可能有很多，比如创建美团外卖等，这样只需要修改工厂类的代码，省去其他的修改操作。
 *
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
