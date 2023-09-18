package com.ttk.iterator;

/**
 * @Author TTK
 * @Description 测试迭代器模式
 *      1）定义：
 *          - 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 *      2）迭代器模式主要包含以下角色：
 *          - 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 *          - 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 *          - 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、
 *            next() 等方法。
 *          - 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对
 *            象的遍历，记录遍历的当前位置。
 *      3）优点：
 *          - 它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。在迭代器模
 *            式中只需要用一个不同的迭代器来替换原有迭代器即可改变遍历算法，我们也可以自己定义迭代器
 *            的子类以支持新的遍历方式。
 *          - 迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方
 *            法，这样可以简化聚合类的设计。
 *          - 在迭代器模式中，由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，
 *            满足 “开闭原则” 的要求。
 *      4）缺点：
 *          - 增加了类的个数，这在一定程度上增加了系统的复杂性。
 *      5）适用场景：
 *          - 当需要为聚合对象提供多种遍历方式时。
 *          - 当需要为遍历不同的聚合结构提供一个统一的接口时。
 *          - 当访问一个聚合对象的内容而无须暴露其内部细节的表示时。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        //添加元素
        aggregate.addStudent(new Student("张三","001"));
        aggregate.addStudent(new Student("李四","002"));
        aggregate.addStudent(new Student("王五","003"));
        aggregate.addStudent(new Student("赵六","004"));

        //遍历聚合对象

        //1,获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        //2,遍历
        while(iterator.hasNext()) {
            //3,获取元素
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
