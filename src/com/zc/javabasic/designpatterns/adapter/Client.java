package com.zc.javabasic.designpatterns.adapter;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-21
 */

public class Client {


    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c  = new Client();
        Adaptee adaptee = new Adaptee();
        Target t = new Adapter();
        c.test1(t);

        Target t2 = new Adapter2(adaptee);
        c.test1(t2);
    }
}
