package com.zc.javabasic.designpatterns.chainofresp;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest leaveRequest) {

        if (leaveRequest.getLeaveDays() < 10 && leaveRequest.getLeaveDays() > 3){
            System.out.println("员工: " + leaveRequest.getEmpName() + " 请假，天数: " + leaveRequest.getLeaveDays() + " ，理由： " + leaveRequest.getReason());
            System.out.println("经理: " + this.name + " ,审批通过！");
        }else{
            if (this.nextLeader != null){
                this.nextLeader.handRequest(leaveRequest);
            }
        }
    }
}
