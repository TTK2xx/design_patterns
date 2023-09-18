package com.ttk.visitor;

/**
 * @Author TTK
 * @Description 具体访问者
 * @Version 1.0
 */
public class Someone implements Person {

    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
