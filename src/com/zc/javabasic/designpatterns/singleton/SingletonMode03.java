package com.zc.javabasic.designpatterns.singleton;

/**
 * @description: 单例 双重锁定
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class SingletonMode03 {
    private volatile static SingletonMode03 instance ;

    public  static SingletonMode03 getInstance(){
        if (instance == null){
            synchronized(SingletonMode03.class){
                if ( instance == null){
                    instance = new SingletonMode03();
                }
            }
        }
        return instance;
    }

    private SingletonMode03(){
        if (instance != null){
            throw new RuntimeException();
        }
    }
}
