package com.ttk.proxy.jdkproxy;

/**
 * @Author TTK
 * @Description 测试jdk代理
 *      1） Java中提供了一个动态代理类Proxy，Proxy并不是我们上述所说的代理对象的类，而是提供了一个创建代理对象的静态方法
 *          （newProxyInstance方法）来获取代理对象
 *      2）具体分析见笔记
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1,创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2,使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3,调用卖调用的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        //让程序一直执行
        while(true) {}

    }
}
