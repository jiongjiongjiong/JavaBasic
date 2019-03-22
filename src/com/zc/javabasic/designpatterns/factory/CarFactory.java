package com.zc.javabasic.designpatterns.factory;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
