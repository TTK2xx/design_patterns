package com.ttk.memento.blackbox;


/**
 * @Author TTK
 * @Description 测试黑盒备忘录模式
 *      0）设计：
 *          - 备忘录角色对发起人对象提供一个宽接口，而为其他对象提供一个窄接口。在Java语言中，实现双重
 *            接口的办法就是将备忘录类设计成发起人类的内部成员类。
 *          - 将 RoleStateMemento 设为 GameRole 的内部类，从而将 RoleStateMemento 对象封装在
 *            GameRole 里面；在外面提供一个标识接口 Memento 给 RoleStateCaretaker 及其他对象使用。
 *            这样 GameRole 类看到的是 RoleStateMemento 所有的接口，而 RoleStateCaretaker 及其他对
 *            象看到的仅仅是标识接口 Memento 所暴露出来的接口，从而维护了封装型
 *      1）定义：
 *          - 又叫快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 *            以便以后当需要时能将该对象恢复到原先保存的状态
 *      2）备忘录模式的主要角色如下：
 *          - 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据
 *            的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *          - 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 *          - 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备
 *            忘录的内容进行访问与修改。
 *        备忘录有两个等效的接口：
 *          - 窄接口：管理者(Caretaker)对象（和其他发起人对象之外的任何对象）看到的是备忘录
 *            的窄接口(narror Interface)，这个窄接口只允许他把备忘录对象传给其他的对象。
 *          - 宽接口：与管理者看到的窄接口相反，发起人对象可以看到一个宽接口(wide
 *            Interface)，这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象
 *            的内部状态。
 *      3）优点：
 *          - 提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。
 *          - 实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。
 *          - 简化了发起人类。发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录
 *            中，并由管理者进行管理，这符合单一职责原则。
 *      4）缺点：
 *          - 资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。
 *      5）适用场景：
 *          - 需要保存与恢复数据的场景，如玩游戏时的中间结果的存档功能。
 *          - 需要提供一个可回滚操作的场景，如 Word、记事本、Photoshop，idea等软件在编辑时按
 *            Ctrl+Z 组合键，还有数据库中事务操作
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------------大战boos前-----------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态操作
        gameRole.stateDisplay();

        //将该游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("---------------大战boos后-----------------");
        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("---------------恢复之前的状态-----------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
