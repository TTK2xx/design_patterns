package com.ttk.proxy.staticproxy;

/**
 * @Author TTK
 * @Description
 * @Version 1.0
 */
public class ProxyPoint implements SellTickets {

    //声明火车站类对象
    private TrainStation trainStation  = new TrainStation();

    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }

}
