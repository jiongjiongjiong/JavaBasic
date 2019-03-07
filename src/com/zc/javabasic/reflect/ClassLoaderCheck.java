package com.zc.javabasic.reflect;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-04
 */

public class ClassLoaderCheck {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("/Users/congzhang/Desktop/", "myClassLoader");
//        MyClassLoader m2 = new MyClassLoader("/Users/congzhang/Code/JavaProject/javabasic/src/com/zc/javabasic/bytecode/", "myClassLoader");
//        Class c = m.loadClass("com.zc.javabasic.reflect.Wali");
        Class c = m.loadClass("Wali");
//        Class c2 = m2.loadClass("com.zc.javabasic.bytecode.Wali");
        System.out.println(c.getClassLoader() + " parent: " + c.getClassLoader().getParent());
        System.out.println("==============");
//        System.out.println(c2.getClassLoader() + " parent: " + c2.getClassLoader().getParent());
        System.out.println("==============");
        c.newInstance();
    }
}
