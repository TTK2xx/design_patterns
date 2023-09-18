package com.ttk.singleton.destruction2;

import java.lang.reflect.Constructor;

/**
 * @Author TTK
 * @Description 测试反射方式破坏单例模式
 *      demo1-7中定义的单例类除枚举类之外均可以被破坏（使之能创建多个对象）。有两种方式破坏，分别是序列化和反射。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1,获取Singleton的字节码对象
//        Class clazz = Singleton1.class;
        Class clazz = Singleton2.class;
        //2,获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3,取消访问检查
        cons.setAccessible(true);
        //4,创建Singleton对象
//        Singleton1 s1 = (Singleton1) cons.newInstance();
//        Singleton1 s2 = (Singleton1) cons.newInstance();
        Singleton2 s1 = (Singleton2) cons.newInstance();
        Singleton2 s2 = (Singleton2) cons.newInstance();

        System.out.println(s1 == s2); //如果返回的是true，说明并没有破坏单例模式，如果是false，说明破坏了单例模式
    }
}
