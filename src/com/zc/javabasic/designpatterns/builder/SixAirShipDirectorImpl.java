package com.zc.javabasic.designpatterns.builder;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public class SixAirShipDirectorImpl implements AirShipDirector {

    private AirShipBuilder builder;

    public SixAirShipDirectorImpl(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();
        OrbitaModule o = builder.builderOrbitaModule();
        EscapeTower t = builder.builderEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(t);
        ship.setOrbitaModule(o);
        System.out.println("装配零件");
        return ship;
    }
}
