package com.zc.javabasic.designpatterns.builder;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public interface AirShipBuilder {
    Engine builderEngine();
    OrbitaModule builderOrbitaModule();
    EscapeTower builderEscapeTower();
}
