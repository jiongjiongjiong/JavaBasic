package com.zc.javabasic.reflect;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-04
 */

public class Robot {
    private String name;
    public void sayHi(String str){
        System.out.println(str + " " + name);
    }

    private String throwHell(String tag){
        return "Hello " + tag;
    }
}
