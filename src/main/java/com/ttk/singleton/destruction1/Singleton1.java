package com.ttk.singleton.destruction1;


import java.io.Serializable;

/**
 * @Author TTK
 * @Description 单例 静态内部类方式
 * @Version 1.0
 */
public class Singleton1 implements Serializable {

    //私有构造方法
    private Singleton1() {}

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    //提供公共的访问方式
    public static Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

