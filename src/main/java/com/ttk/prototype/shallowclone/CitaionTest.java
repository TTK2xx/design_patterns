package com.ttk.prototype.shallowclone;

/**
 * @Author TTK
 * @Description 测试浅克隆
 *      1）浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 *      2）深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *      3）实现：Java中的Object类中提供了 clone() 方法来实现浅克隆。 Cloneable 接口是上面的类图中的抽象原型类，而实现了Cloneable接口的子实现类就是具体的原型类。
 *      4）情景：同一学校的“三好学生”奖状除了获奖人姓名不同，其他都相同，可以使用原型模式复制多个“三好学生”奖状出来，然后在修改奖状上的名字即可。
 *      5）实际应用：
 *          - 对象的创建非常复杂，可以使用原型模式快捷的创建对象。
 *          - 性能和安全要求比较高。
 * @Version 1.0
 */

public class CitaionTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1，创建原型对象
        Citation citation = new Citation();
        //创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        //2,克隆奖状对象
        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        /*citation.setName("张三");
        citation1.setName("李四");*/

        //3,调用show方法展示
        citation.show();
        citation1.show();
        //stu对象和stu1对象是同一个对象，就会产生将stu1对象中name属性值改为“李四”，两个
        //Citation（奖状）对象中显示的都是李四。这就是浅克隆的效果
    }
}
