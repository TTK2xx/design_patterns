package com.ttk.builder.demo2;

/**
 * @Author TTK
 * @Description 抽象建造者类
 *          建造者模式除了demo1的用途外，在开发中还有一个常用的使用方式，就是当一个类构造器需要传入
 *      很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者
 *      模式进行重构。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建手机对象   通过构建者对象获取手机对象
        Computer computer = new Computer.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();

        System.out.println(computer);
    }
}
