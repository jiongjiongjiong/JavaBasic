package com.zc.javabasic.designpatterns.bridge;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-23
 */

public class Client {

    public static void main(String[] args) {
        Computer computer = new Laptop(new Lenovo());
        computer.sale();
    }
}
