package com.zc.javabasic.designpatterns.bridge;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-23
 */

public interface Brand {

    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}


class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}