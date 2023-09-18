package com.ttk.composite;


/**
 * @Author TTK
 * @Description 菜单项类 ： 属于叶子节点
 *      - MenuItem是菜单项，不能再有子菜单，所以添加菜单，移除菜单和获取子菜单的功能并不能实现。
 * @Version 1.0
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    public void print() {
        //打印菜单项的名称
        for(int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
