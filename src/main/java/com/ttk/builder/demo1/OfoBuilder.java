package com.ttk.builder.demo1;

/**
 * @Author TTK
 * @Description 具体建造者类
 * @Version 1.0
 */
public class OfoBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    public Bike createBike() {
        return bike;
    }
}
