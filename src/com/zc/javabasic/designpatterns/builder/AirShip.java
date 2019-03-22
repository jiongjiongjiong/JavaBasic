package com.zc.javabasic.designpatterns.builder;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-18
 */

public class AirShip {
    private OrbitaModule orbitaModule;
    private Engine engine;
    private EscapeTower escapeTower;

    public OrbitaModule getOrbitaModule() {
        return orbitaModule;
    }

    @Override
    public String toString() {
        return "AirShip{" +
                "orbitaModule=" + orbitaModule +
                ", engine=" + engine +
                ", escapeTower=" + escapeTower +
                '}';
    }

    public void setOrbitaModule(OrbitaModule orbitaModule) {
        this.orbitaModule = orbitaModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

class OrbitaModule{
    private String name;

    public OrbitaModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {
        this.name = name;
    }
}