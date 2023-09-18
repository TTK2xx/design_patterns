package com.ttk.visitor;

/**
 * @Author TTK
 * @Description 具体被访问元素
 * @Version 1.0
 */
public class Cat implements Animal {

    public void accept(Person person) {
        person.feed(this); //访问者给宠物猫喂食
        System.out.println("好好吃，喵喵喵。。。");
    }
}
