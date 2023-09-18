package com.ttk.decorator;

/**
 * @Author TTK
 * @Description 测试装饰器模式
 *      1）定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
 *      2）角色：
 *          - 抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
 *          - 具体构件（Concrete Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 *          - 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子
 *            类扩展具体构件的功能。
 *          - 具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附
 *            加的责任。
 *      3）优点：
 *          - 饰者模式可以带来比继承更加灵活性的扩展功能，使用更加方便，可以通过组合不同的装饰者对象
 *            来获取具有不同行为状态的多样化的结果。装饰者模式比继承更具良好的扩展性，完美的遵循开闭
 *            原则，继承是静态的附加责任，装饰者则是动态的附加责任。
 *          - 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以
 *            动态扩展一个实现类的功能。
 *      4）缺点：
 *          - 多层装饰比较复杂
 *      5）使用场景：
 *          - 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 *          - 当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 *      6）静态代理和装饰器模式的区别：
 *          - 相同点：
 *              - 都要实现与目标类相同的业务接口
 *              - 在两个类中都要声明目标对象
 *              - 都可以在不修改目标类的前提下增强目标方法
 *          - 不同点：
 *              - 目的不同 装饰者是为了增强目标对象 静态代理是为了保护和隐藏目标对象
 *              - 获取目标对象构建的地方不同 装饰者是由外界传递进来，可以通过构造方法传递 静态代理
 *              - 是在代理类内部创建，以此来隐藏目标对象
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("===============");

        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");
    }
}
