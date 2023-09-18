package com.ttk.observer;


/**
 * @Author TTK
 * @Description 测试观察者模式
 *      1）定义：
 *          - 又被称为发布-订阅（Publish/Subscribe）模式，它定义了一种一对多的依赖关系，让多个观察者
 *            对象同时监听某一个主题对象。这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自
 *            动更新自己。
 *      2）在观察者模式中有如下角色：
 *          - Subject：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每
 *            个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 *          - ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，在具
 *            体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 *          - Observer：抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知
 *            时更新自己。
 *          - ConcrereObserver：具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知
 *            时更新自身的状态。
 *      3）优点：
 *          - 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
 *          - 被观察者发送通知，所有注册的观察者都会收到信息【可以实现广播机制】
 *      4）缺点：
 *          - 如果观察者非常多的话，那么所有的观察者收到被观察者发送的通知会耗时
 *          - 如果被观察者有循环依赖的话，那么被观察者发送通知会使观察者循环调用，会导致系统崩溃
 *      5）适用场景：
 *          - 对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
 *          - 当一个抽象模型有两个方面，其中一个方面依赖于另一方面时。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1,创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //2,订阅公众号
        WeiXinUser user1 = new WeiXinUser("孙悟空");
        WeiXinUser user2 = new WeiXinUser("猪悟能");
        WeiXinUser user3 = new WeiXinUser("沙悟净");
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        //3,公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("传智黑马的专栏更新了！");
        subject.detach(user2);
        subject.notify("爷爷你关注的up更新了！");
    }
}
