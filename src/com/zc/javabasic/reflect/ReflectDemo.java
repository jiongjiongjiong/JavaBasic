package com.zc.javabasic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-04
 */

public class ReflectDemo {
    public static void main(String[] args) throws Exception {

        Class rt = Class.forName("com.zc.javabasic.reflect.Robot");
        Robot robot = (Robot) rt.newInstance();
        System.out.println("Class name is " + rt.getName());
        Method getHello = rt.getDeclaredMethod("throwHell", String.class);
        getHello.setAccessible(true);
        System.out.println(getHello.invoke(robot,"abc"));
        Method sayHi = rt.getMethod("sayHi", String.class);
        sayHi.invoke(robot, "tk");
        Field field = rt.getDeclaredField("name");
        field.setAccessible(true);
        field.set(robot, "wxm");
        sayHi.invoke(robot, "tk");
    }
}
