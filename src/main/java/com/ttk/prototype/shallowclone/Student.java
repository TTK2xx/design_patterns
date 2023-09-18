package com.ttk.prototype.shallowclone;

/**
 * @Author TTK
 * @Description
 * @Version 1.0
 */
public class Student {

    //学生的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
