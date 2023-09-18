package com.ttk.singleton.destruction1;

import java.io.Serializable;

/**
 * @Author TTK
 * @Description 单例 静态内部类方式
 *
 * @Version 1.0
 */
public class Singleton2 implements Serializable {

    //私有构造方法
    private Singleton2() {}

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    //提供公共的访问方式
    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

}
