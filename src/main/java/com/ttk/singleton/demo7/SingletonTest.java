package com.ttk.singleton.demo7;

/**
 * @Author TTK
 * @Description 单例模式 饿汉式（枚举类）
 *      1) 属于饿汉式
 *      2）枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，
 *          设计者充分的利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是
 *          所用单例实现中唯一一种不会被破坏的单例实现模式。
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
    }
}

//使用枚举，可以实现单例, 推荐
enum Singleton {
    INSTANCE; //属性
}