package com.zc.javabasic.designpatterns.singleton;

/**
 * @description: 单例 懒汉模式
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class SingletonMode02 {
    private static SingletonMode02 instance ;

    static synchronized SingletonMode02 getInstance(){
        if (instance == null){
            instance = new SingletonMode02();
        }
        return instance;
    }

    private SingletonMode02(){
        if (instance != null){
//            throw new RuntimeException();
        }
    }
}
