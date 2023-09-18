package com.ttk.responsibilitychain.demo1;

/**
 * @Author TTK
 * @Description 部门经理类（具体的处理者）
 * @Version 1.0
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意");
    }
}
