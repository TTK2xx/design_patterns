package com.ttk.singleton.destruction1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author TTK
 * @Description 测试序列化方式破坏单例模式  Singleton1是普通情况，Singleton2是解决办法
 *      demo1-7中定义的单例类除枚举类之外均可以被破坏（使之能创建多个对象）。有两种方式破坏，分别是序列化和反射。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 使用Singleton1时创建的对象不同，使用Singleton2时创建的对象相同
        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件读取数据（对象）
    public static void readObjectFromFile() throws Exception {
        //1,创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\TTK\\Desktop\\a.txt"));
        //2,读取对象
//        Singleton1 instance = (Singleton1) ois.readObject();
        Singleton2 instance = (Singleton2) ois.readObject();

        System.out.println(instance);

        //释放资源
        ois.close();
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //1,获取Singleton对象
//        Singleton1 instance = Singleton1.getInstance();
        Singleton2 instance = Singleton2.getInstance();
        //2,创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\TTK\\Desktop\\a.txt"));
        //3,写对象
        oos.writeObject(instance);
        //4,释放资源
        oos.close();
    }
}

