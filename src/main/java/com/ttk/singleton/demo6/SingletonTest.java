package com.ttk.singleton.demo6;

/**
 * @Author TTK
 * @Description 单例模式 懒汉式（静态内部类）
 *      1) JVM在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
 *          并初始化其静态属性。静态属性由于被static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *      2) 第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder
 *          并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *      3) 总结：静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任
 *          何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }

}

// 静态内部类完成， 推荐使用
class Singleton {

    //构造器私有化
    private Singleton() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static Singleton getInstance() {

        return SingletonHolder.INSTANCE;
    }
}
