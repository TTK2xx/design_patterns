package com.ttk.singleton.destruction2;

/**
 * @Author TTK
 * @Description 单例 懒汉 静态内部类
 *      解决反射对单例的破坏：当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。
 * @Version 1.0
 */
public class Singleton2 {

    private static boolean flag = false;

    //私有构造方法
    private Singleton2() {
        synchronized (Singleton2.class) {

            //判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常，如果是false的话，说明第一次访问
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag的值设置为true
            flag = true;
        }
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    //提供公共的访问方式
    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}