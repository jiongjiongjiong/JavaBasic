package com.zc.javabasic.designpatterns.prototype;

import java.util.Date;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-20
 */

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("ming", new Date());
//        System.out.println(s1.getSname());
        //浅克隆
        Sheep s2 = (Sheep) s1.clone();
//        System.out.println("s2-name:" + s2.getSname());
//        System.out.println("s1-name:" + s1.getSname());
//        s2.setSname("ttt");
//        System.out.println("s2-name:" + s2.getSname());
//        System.out.println("s1-name:" + s1.getSname());
//        s1.setSname("bbb");
//        System.out.println("s2-name:" + s2.getSname());
//        System.out.println("s1-name:" + s1.getSname());
        s1.setBirthday(new Date(1234567890123L));
        System.out.println("s2-date:" + s2.getBirthday());
        System.out.println("s1-date:" + s1.getBirthday());
    }
}
