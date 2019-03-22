package com.zc.javabasic.designpatterns.factory;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public class Client {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
}
