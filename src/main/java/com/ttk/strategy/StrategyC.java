package com.ttk.strategy;

/**
 * @Author TTK
 * @Description 具体策略类，封装算法
 * @Version 1.0
 */
public class StrategyC implements Strategy {

    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
