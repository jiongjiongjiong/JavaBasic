package com.zc.javabasic.designpatterns.singleton;

/**
 * @description: 单例
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class SingletonMode04 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static class SingletonHolder{
        private final static SingletonMode04 INSTANCE = new SingletonMode04();
    }

    public  static SingletonMode04 getInstance(){
       return SingletonHolder.INSTANCE;
    }

    private SingletonMode04(){
    }
}
