package com.zc.javabasic.designpatterns.adapter;

/**
 * @description: 被适配的类
 * @author: Zhangc
 * @date: 2018-12-21
 */

public class Adaptee {

    public void request(){
        System.out.println("可以完成客户需要的功能！");
    }
}
