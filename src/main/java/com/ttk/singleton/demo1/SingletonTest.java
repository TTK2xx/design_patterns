package com.ttk.singleton.demo1;

/**
 * @Author TTK
 * @Description 单例模式 饿汉式(静态变量)
 *      饿汉式：类加载就会导致该单实例对象被创建
 *      懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 *
 *      1) 描述：该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
 *         instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存
 *         的浪费。
 *      2) 优点：写法简单，在类装载的时候就完成实例化，避免线程同步问题
 *      3) 缺点：如果对象比较大且一直没被使用，就会造成内存浪费
 *
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

//饿汉式(静态变量)

class Singleton {

    //1. 构造器私有化, 外部能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}