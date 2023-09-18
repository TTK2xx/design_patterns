package com.ttk.strategy;

/**
 * @Author TTK
 * @Description 具体策略类，封装算法
 * @Version 1.0
 */
public class StrategyA implements Strategy {

    public void show() {
        System.out.println("买一送一");
    }
}
