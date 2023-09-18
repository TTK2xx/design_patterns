package com.ttk.prototype.demo;

/**
 * @Author TTK
 * @Description 测试原型模式
 *      1）概念：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。
 *      2）原型模式包含如下角色：
 *          - 抽象原型类：规定了具体原型对象必须实现的 clone() 方法。
 *          - 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 *          - 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * @Version 1.0
 */
public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        //调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象？" + (realizetype == clone));
    }
}
