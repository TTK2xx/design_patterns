package com.ttk.factory.configfactory;

/**
 * @Author TTK
 * @Description 测试配置文件加简单工厂模式 （开发中常用，Spring的源码采用了类似的实现）
 *      1）通过工厂模式+配置文件的方式解除工厂对象和产品对象的耦合。在工厂类中加载配置文件中的全类名，并创建对
 *          象进行存储，客户端如果需要对象，直接进行获取即可。
 *      2）在CoffeeFactory类中，使用静态成员变量用来存储创建的对象（键存储的是名称，值存储的是对应的对象），
 *          而读取配置文件以及创建对象写在静态代码块中，目的就是只需要执行一次。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());

        System.out.println("=============");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
