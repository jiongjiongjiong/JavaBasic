package com.zc.javabasic.designpatterns.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-22
 */

public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        JdkProxy handler = new JdkProxy(realStar);
        Star proxyInstance = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
//        proxyInstance.confer();
//        proxyInstance.signContract();
//        proxyInstance.bookTicket();
        proxyInstance.sing();
//        proxyInstance.collectMoney();

        System.out.println("CGLIB PROXY ================");
        Star realStar2 = new RealStar();
        CglibProxy cglibProxy = new CglibProxy(realStar2);
        Star proxy2 = (Star) cglibProxy.createProxy();
        proxy2.sing();
    }
}
