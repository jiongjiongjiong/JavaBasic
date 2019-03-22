package com.zc.javabasic.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @description: 测试反射和反序列化
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class client2 {

    public static void main(String[] args) throws Exception {
        SingletonMode06 s1 = SingletonMode06.getInstance();
        SingletonMode06 s2 = SingletonMode06.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //反射
        Class<SingletonMode06> clazz = (Class<SingletonMode06>) Class.forName("com.zc.study.design.patterns.singleton.SingletonMode06");
        Constructor<SingletonMode06> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
//        SingletonMode06 s3 = c.newInstance(null);
//        SingletonMode06 s4 = c.newInstance(null);
//        System.out.println(s3);
//        System.out.println(s4);

        //反序列化
        FileOutputStream fos = new FileOutputStream("./a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        SingletonMode06 s3  = (SingletonMode06) ois.readObject();
        System.out.println(s3);


    }
}
