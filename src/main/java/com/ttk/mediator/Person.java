package com.ttk.mediator;

/**
 * @Author TTK
 * @Description 抽象同事类
 * @Version 1.0
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
