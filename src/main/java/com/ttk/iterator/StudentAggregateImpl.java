package com.ttk.iterator;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author TTK
 * @Description 具体聚合角色
 * @Version 1.0
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();

    public void addStudent(Student stu) {
        list.add(stu);
    }

    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    //获取迭代器对象
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
