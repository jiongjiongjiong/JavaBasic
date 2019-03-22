package com.zc.javabasic.designpatterns.factory;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("高级货");
    }

    @Override
    public void start() {
        System.out.println("跑得快");
    }
}

class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("低端货");
    }

    @Override
    public void start() {
        System.out.println("拖拉机");
    }
}
