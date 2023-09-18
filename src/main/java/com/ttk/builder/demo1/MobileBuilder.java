package com.ttk.builder.demo1;

/**
 * @Author TTK
 * @Description 具体建造者类
 * @Version 1.0
 */
public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    public Bike createBike() {
        return bike;
    }
}
