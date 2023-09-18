package com.ttk.prototype.deepclone;

import java.io.Serializable;

/**
 * @Author TTK
 * @Description
 * @Version 1.0
 */
public class Student implements Serializable {

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
