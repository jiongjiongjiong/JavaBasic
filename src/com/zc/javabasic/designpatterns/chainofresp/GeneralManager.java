package com.zc.javabasic.designpatterns.chainofresp;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest leaveRequest) {

        if (leaveRequest.getLeaveDays() < 30 ){
            System.out.println("员工: " + leaveRequest.getEmpName() + " 请假，天数: " + leaveRequest.getLeaveDays() + " ，理由： " + leaveRequest.getReason());
            System.out.println("总经理: " + this.name + " ,审批通过！");
        }else{
            System.out.println("莫非 " + leaveRequest.getEmpName() + " 要辞职！");
        }
    }
}
