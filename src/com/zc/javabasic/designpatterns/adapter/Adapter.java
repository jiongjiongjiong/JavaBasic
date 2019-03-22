package com.zc.javabasic.designpatterns.adapter;

/**
 * @description: 适配器(类适配器方式)
 * @author: Zhangc
 * @date: 2018-12-21
 */

public class Adapter extends Adaptee implements Target {


    @Override
    public void handleReq() {
        super.request();
    }
}
