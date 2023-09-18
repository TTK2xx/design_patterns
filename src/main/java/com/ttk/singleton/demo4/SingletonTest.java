package com.ttk.singleton.demo4;

/**
 * @Author TTK
 * @Description 单例模式 懒汉式（线程安全，同步方法）
 *      1)描述：该方式实现了懒加载效果，同时又解决了线程安全问题。但是每个线程执行getInstance()方法都要进行同步，效率太低。
 *          从上面代码我们可以看出，其实就是在初始化instance的时候才会出现线程安全问题，后面直接return这个实例就行了
 *      2)优点：线程安全
 *      3)缺点：效率问题
 *      4)实际开发中不推荐使用
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

// 懒汉式(线程安全，同步方法)
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
