package com.zc.javabasic.designpatterns.builder;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public class SixAirShipBuilderImpl implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("myEngine");
    }

    @Override
    public OrbitaModule builderOrbitaModule() {
        System.out.println("构建轨道舱");
        return new OrbitaModule("myOrbita");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸舱");
        return new EscapeTower("myEscape");
    }
}
