package com.zc.javabasic.designpatterns.chainofresp;

/**
 * @description: 封装的基本信息
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class LeaveRequest {
    private String  empName;
    private int leaveDays;
    private String  reason;

    public LeaveRequest(String empName, int leaveDays, String reason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "empName='" + empName + '\'' +
                ", leaveDays=" + leaveDays +
                ", reason='" + reason + '\'' +
                '}';
    }
}
