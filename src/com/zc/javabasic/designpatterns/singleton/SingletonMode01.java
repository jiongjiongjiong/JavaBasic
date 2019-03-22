package com.zc.javabasic.designpatterns.singleton;

/**
 * @description: 单例 饿汉模式
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class SingletonMode01 {
    private static SingletonMode01 instance = new SingletonMode01();

    public static SingletonMode01 getInstance(){
        return instance;
    }

    private SingletonMode01(){
        if (instance != null){
            System.out.println("反射");
//            throw new RuntimeException();
        }
    }
}
