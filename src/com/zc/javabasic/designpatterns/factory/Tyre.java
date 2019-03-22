package com.zc.javabasic.designpatterns.factory;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("舒适性好");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("舒适性差");
    }
}