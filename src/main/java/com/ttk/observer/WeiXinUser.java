package com.ttk.observer;

/**
 * @Author TTK
 * @Description 具体观察者角色类
 * @Version 1.0
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
