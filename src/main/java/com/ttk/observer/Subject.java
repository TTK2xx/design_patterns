package com.ttk.observer;


/**
 * @Author TTK
 * @Description 抽象的被观察者类
 * @Version 1.0
 */
public interface Subject {

    //添加订阅者（添加观察者对象）
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}
