package com.zc.javabasic.designpatterns.factory;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public interface Seat {
    void massage();
}


class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("电动座椅");
    }
}

class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("手动座椅");
    }
}