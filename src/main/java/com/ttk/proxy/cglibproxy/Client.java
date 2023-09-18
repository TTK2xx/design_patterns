package com.ttk.proxy.cglibproxy;

/**
 * @Author TTK
 * @Description 测试cglib动态代理
 *      1）概述：
 *          - 如果没有定义SellTickets接口，只定义了TrainStation(火车站类)。很显然JDK代理是无法使用
 *            了，因为JDK动态代理要求必须定义接口，对接口进行代理。
 *          - CGLIB是一个功能强大，高性能的代码生成包。它为没有实现接口的类提供代理，为JDK的动态代理提
 *            供了很好的补充。
 *      2）CGLIB是第三方提供的包，所以需要引入jar包的坐标：
 *          <dependency>
 *              <groupId>cglib</groupId>
 *              <artifactId>cglib</artifactId>
 *              <version>2.2.2</version>
 *          </dependency>
 *
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
