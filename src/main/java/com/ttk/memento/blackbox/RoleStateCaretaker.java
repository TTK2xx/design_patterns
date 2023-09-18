package com.ttk.memento.blackbox;


/**
 * @Author TTK
 * @Description 管理者角色类
 *      负责人角色类 RoleStateCaretaker 能够得到的备忘录对象是以 Memento 为接口的，由于这个接
 * 口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容
 * @Version 1.0
 */
public class RoleStateCaretaker {

    //声明RoleStateMemento类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
