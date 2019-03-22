package com.zc.javabasic.designpatterns.proxy.staticdemo;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-22
 */

public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxy = new ProxyStar(realStar);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();

        proxy.collectMoney();
    }
}
