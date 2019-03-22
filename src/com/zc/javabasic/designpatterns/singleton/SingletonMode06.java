package com.zc.javabasic.designpatterns.singleton;

import java.io.Serializable;

/**
 * @description: 单例 懒汉模式 如何防止反射和反序列化
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class SingletonMode06 implements Serializable {
    private static SingletonMode06 instance ;

    static synchronized SingletonMode06 getInstance(){
        if (instance == null){
            instance = new SingletonMode06();
        }
        return instance;
    }

    private SingletonMode06(){
        if (instance != null){
            throw new RuntimeException();
        }
    }

    /**
     * 反序列化时，如果定义了readResolve()则直接返回此方法制定的对象，而不需要单独再创建新对象
     * @return
     */
    private Object readResolve(){
        return instance;
    }
}
