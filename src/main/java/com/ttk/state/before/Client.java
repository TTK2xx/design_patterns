package com.ttk.state.before;

/**
 * @Author TTK
 * @Description 测试 这不是状态模式，是一个反例
 *      1）案例：
 *          - 通过按钮来控制一个电梯的状态，一个电梯有开门状态，关门状态，停止状态，运行状态。每一
 *            种状态改变，都有可能要根据其他状态来更新处理。例如，如果电梯门现在处于运行时状态，就不能进
 *            行开门操作，而如果电梯门是停止状态，就可以执行开门操作。
 *      2）这样实现的问题：
 *          - 使用了大量的switch…case这样的判断（if…else也是一样)，使程序的可阅读性变差。
 *          - 扩展性很差。如果新加了断电的状态，我们需要修改上面判断逻辑
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建电梯对象
        Lift lift = new Lift();

        //设置当前电梯的状态
        lift.setState(ILift.CLOSING_STATE);

        //打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
