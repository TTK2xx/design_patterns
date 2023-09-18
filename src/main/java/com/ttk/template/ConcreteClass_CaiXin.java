package com.ttk.template;

/**
 * @Author TTK
 * @Description 抽象类（定义模板方法和基本方法）
 * @Version 1.0
 */
public class ConcreteClass_CaiXin extends AbstractClass {

    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
