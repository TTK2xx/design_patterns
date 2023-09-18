package com.ttk.composite;

/**
 * @Author TTK
 * @Description 菜单组件，属于抽象根节点
 *      - 这里的MenuComponent定义为抽象类，因为有一些共有的属性和行为要在该类中实现，Menu和
 *          MenuItem类就可以只覆盖自己感兴趣的方法，而不用搭理不需要或者不感兴趣的方法，举例来说，
 *          Menu类可以包含子菜单，因此需要覆盖add()、remove()、getChild()方法，但是MenuItem就不
 *          应该有这些方法。这里给出的默认实现是抛出异常，你也可以根据自己的需要改写默认实现。
 * @Version 1.0
 */
public abstract class MenuComponent {
    //菜单组件的名称
    protected String name;
    //菜单组件的层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    //获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }

    //打印菜单名称的方法（包含子菜单和字菜单项）
    public abstract void print();
}
