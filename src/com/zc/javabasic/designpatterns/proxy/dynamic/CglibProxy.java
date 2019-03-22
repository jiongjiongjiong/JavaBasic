package com.zc.javabasic.designpatterns.proxy.dynamic;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-18
 */

public class CglibProxy implements MethodInterceptor {

    private Star realStar;

    public CglibProxy(Star realStar) {
        super();
        this.realStar = realStar;
    }

    /**
     * 创建代理对象
     * @return
     */
    public Object createProxy(){
        // 1.声明增强类实例,用于生产代理类
        Enhancer enhancer = new Enhancer();
        // 2.设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(realStar.getClass());
        // 3.//设置回调函数，即一个方法拦截
        enhancer.setCallback(this);
        // 4.创建代理:
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object object = null;
        System.out.println("真正方执行前");
        if ("sing".equals(method.getName())){
            method.invoke(realStar, args);
        }

        System.out.println("真正方法执行后");
        return object;
    }
}
