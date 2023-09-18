package com.ttk.iterator;

/**
 * @Author TTK
 * @Description 抽象聚合角色
 * @Version 1.0
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student stu);

    //删除学生功能
    void removeStudent(Student stu);

    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}
