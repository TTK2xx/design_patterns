package com.ttk.prototype.deepclone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author TTK
 * @Description 测试深克隆
 *      1）浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 *      2）深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *      3）实现：序列化
 *      4）情景：同一学校的“三好学生”奖状除了获奖人姓名不同，其他都相同，可以使用原型模式复制多个“三好学生”奖状出来，然后在修改奖状上的名字即可。
 *      5）
 * @Version 1.0
 */

public class CitaionTest {
    public static void main(String[] args) throws Exception {
        //1，创建原型对象
        Citation citation = new Citation();
        //创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/robin/a.txt"));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/robin/a.txt"));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        //释放资源
        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();
    }
}
