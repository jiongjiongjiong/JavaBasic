package com.zc.javabasic.designpatterns.chainofresp;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public abstract class Leader {
    protected String    name;
    /**
     * 责任链上的后继对象
     */
    protected Leader    nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    /**
     * 设定责任链上的后继对象
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handRequest(LeaveRequest leaveRequest);
}

