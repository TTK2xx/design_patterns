package com.ttk.command;

/**
 * @Author TTK
 * @Description 厨师类（属于实现者/接收者）
 * @Version 1.0
 */
public class SeniorChef {

    public void makeFood(String name,int num) {
        System.out.println(num + "份" + name);
    }
}
