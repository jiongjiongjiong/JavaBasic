package com.zc.javabasic.designpatterns.builder;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public class Client {

    public static void main(String[] args) {
        AirShipDirector director = new SixAirShipDirectorImpl(new SixAirShipBuilderImpl());

        AirShip ship = director.directorAirShip();
        System.out.println(ship.getEngine().getName());
    }
}
