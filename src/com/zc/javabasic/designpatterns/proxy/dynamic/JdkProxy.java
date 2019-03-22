package com.zc.javabasic.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: 代理类的实现
 * @author: Zhangc
 * @date: 2018-12-22
 */

public class JdkProxy implements InvocationHandler {

    private Star realStar;

    public JdkProxy(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("真正方执行前");
        if ("sing".equals(method.getName())){
            method.invoke(realStar, args);
        }

        System.out.println("真正方法执行后");
        return object;
    }
}
