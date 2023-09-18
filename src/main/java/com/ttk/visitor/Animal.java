package com.ttk.visitor;

/**
 * @Author TTK
 * @Description 抽象的被访问元素
 * @Version 1.0
 */
public interface Animal {

    //接受访问者访问的功能
    void accept(Person person);
}
