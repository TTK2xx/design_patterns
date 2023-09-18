package com.ttk.singleton.demo2;

/**
 * @Author TTK
 * @Description 单例模式 饿汉式(静态代码块)
 *      1) 描述：该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着
 *          类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
 *      2) 优点：写法简单，在类装载的时候就完成实例化，避免线程同步问题
 *      3) 缺点：如果对象比较大且一直没被使用，就会造成内存浪费
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

//饿汉式(静态代码块)

class Singleton {

    //1. 构造器私有化, 外部能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private  static Singleton instance;

    static { // 在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}