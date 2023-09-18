package com.ttk.proxy.staticproxy;

/**
 * @Author TTK
 * @Description 测试静态代理模式
 *      1）概述：
 *          - 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接
 *            引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 *          - Java中的代理按照代理类生成时机不同又分为静态代理和动态代理。静态代理代理类在编译期就生
 *            成，而动态代理代理类则是在Java运行时动态生成。动态代理又有JDK代理和CGLib代理两种。
 *      2）结构：
 *          - 抽象主题（Subject）类： 通过接口或抽象类声明真实主题和代理对象实现的业务方法。   SellTickets
 *          - 真实主题（Real Subject）类： 实现了抽象主题中的具体业务，是代理对象所代表的真实对
 *            象，是最终要引用的对象。   TrainStation
 *          - 代理（Proxy）类： 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访
 *            问、控制或扩展真实主题的功能。  ProxyPoint
 *      3）描述：火车站代售点卖票场景
 *          - 从下面代码中可以看出测试类直接访问的是ProxyPoint类对象，也就是说ProxyPoint作为访问对象
 *            和目标对象的中介。同时也对sell方法进行了增强（代理点收取一些服务费用）。
 *
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();
    }
}
