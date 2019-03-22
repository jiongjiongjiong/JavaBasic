package com.zc.javabasic.designpatterns.decorator;

/**
 * @description: 装饰器模式 测试
 * @author: Zhangc
 * @date: 2018-12-26
 */

public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新功能，飞行=================");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新功能，水里================");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加新功能，飞行+水里================");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();
    }
}
