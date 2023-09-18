package com.ttk.adapter.objectadapter;

import com.ttk.adapter.classadapter.Computer;
import com.ttk.adapter.classadapter.SDCardImpl;

/**
 * @Author TTK
 * @Description 测试适配器模式 类适配器模式
 *      1）概述：
 *          - 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能
 *            一起工作。
 *          - 适配器模式分为类适配器模式和对象适配器模式，前者类之间的耦合度比后者高，且要求程序员了解现
 *            有组件库中的相关组件的内部结构，所以应用相对较少些。
 *      2）适配器模式（Adapter）包含以下主要角色：
 *          - 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 *          - 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *          - 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成
 *            目标接口，让客户按目标接口的格式访问适配者。
 *      3）适用场景：
 *          - 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
 *          - 使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
 *      4）对象适配器模式实现方式：
 *          - 可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        com.ttk.adapter.classadapter.Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        //使用该电脑读取TF卡中的数据
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF adapter = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(adapter));
    }
}
