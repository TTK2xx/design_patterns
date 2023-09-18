package com.ttk.mediator;

/**
 * @Author TTK
 * @Description 具体的同事角色类
 * @Version 1.0
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介联系（沟通）
    public void constact(String message) {
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是：" + message);
    }
}
