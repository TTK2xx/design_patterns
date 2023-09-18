package com.ttk.singleton.demo3;

/**
 * @Author TTK
 * @Description 单例模式 懒汉式（线程不安全）
 *      1）该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的
 *          赋值操作，那么什么时候赋值的呢？当调用getInstance()方法获取Singleton类的对象的时
 *          候才创建Singleton类的对象，这样就实现了懒加载的效果。但是，如果是多线程环境，会出现
 *          线程安全问题。
 *      2）优点：起到了lazy loading的效果
 *      3）缺点：只能在单线程下使用，如果一个线程进入到了if(instance == null)判断代码块，还没来得及往下执行，
 *          另一个线程也通过了这个判断语句，这时就会产生多个实例
 *      4）在实际开发中不要使用这种方式
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}