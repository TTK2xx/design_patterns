package com.ttk.mediator;

/**
 * @Author TTK
 * @Description 具体的中介者角色类
 * @Version 1.0
 */
public class MediatorStructure extends Mediator {

    //聚合房主和租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    // 房主和租房者对象的get和set方法
    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void constact(String message, Person person) {
        if(person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
