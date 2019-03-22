package com.zc.javabasic.designpatterns.adapter;

/**
 * @description: 适配器(对象适配器方式，使用组合方式，跟被适配对象整合)
 * @author: Zhangc
 * @date: 2018-12-21
 */

public class Adapter2  implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
