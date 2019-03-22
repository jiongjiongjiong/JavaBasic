package com.zc.javabasic.designpatterns.chainofresp;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class Client {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");
        //组织责任链
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest request = new LeaveRequest("TOM",15, "度假去了~~~");
        LeaveRequest request2 = new LeaveRequest("TOM",1, "度假去了~~~");
        LeaveRequest request3 = new LeaveRequest("TOM",9, "度假去了~~~");
        LeaveRequest request4 = new LeaveRequest("TOM",30, "度假去了~~~");
        a.handRequest(request);
        a.handRequest(request2);
        a.handRequest(request3);
        a.handRequest(request4);

    }
}
