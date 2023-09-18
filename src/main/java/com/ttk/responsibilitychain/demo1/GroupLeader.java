package com.ttk.responsibilitychain.demo1;

/**
 * @Author TTK
 * @Description 小组长类（具体的处理者）
 * @Version 1.0
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("小组长审批：同意");
    }
}
