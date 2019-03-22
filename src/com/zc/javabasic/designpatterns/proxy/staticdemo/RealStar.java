package com.zc.javabasic.designpatterns.proxy.staticdemo;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-22
 */

public class RealStar implements Star{

    /**
     * 面谈
     */
    @Override
    public void confer() {
        System.out.println("RealStart.confer()");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        System.out.println("RealStart.signContract()");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        System.out.println("RealStart.bookTicket()");
    }

    /**
     * 唱歌
     */
    @Override
    public void sing() {
        System.out.println("RealStart.sing()");
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        System.out.println("RealStart(xxx).collectMoney()");
    }
}
