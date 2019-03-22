package com.zc.javabasic.designpatterns.decorator;

/**
 * @description: 装饰器模式
 * @author: Zhangc
 * @date: 2018-12-26
 */

public interface ICar {
    void move();
}

class Car implements ICar{

    @Override
    public void move() {
        System.out.println("普通汽车，路上跑~");
    }
}

/**
 * 装饰器-01
 */
class SuperCar implements ICar{

    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * 具体装饰 角色
 */
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞~~~");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * 具体装饰 角色
 */
class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水里游~~~");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}