package com.zc.javabasic.designpatterns.singleton;


import java.util.concurrent.ExecutorService;


import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class client {

    public static void main(String[] args) throws Exception {
//        SingletonMode01 s1 = SingletonMode01.getInstance();
//        SingletonMode01 s2 = SingletonMode01.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println("==============================");
//        SingletonMode02 s21 = SingletonMode02.getInstance();
//        SingletonMode02 s22 = SingletonMode02.getInstance();
//        System.out.println(s21);
//        System.out.println(s22);
//        System.out.println("==============================");
//        SingletonMode03 s31 = SingletonMode03.getInstance();
//        SingletonMode03 s32 = SingletonMode03.getInstance();
//        System.out.println(s31);
//        System.out.println(s32);
//        System.out.println("==============================");
//        SingletonMode04 s41 = SingletonMode04.getInstance();
//        SingletonMode04 s42 = SingletonMode04.getInstance();
//        System.out.println(s41);
//        System.out.println(s42);
//        System.out.println("==============================");

        ExecutorService executor = newFixedThreadPool(3);
        for (int i=0;i<3;i++) {
            int j = 0;
//            executor.submit(()->
//                    myTask(j)
//            );
            executor.execute(new MyTask());

        }
    }

    static class MyTask implements Runnable{
        public static int i = 0;
        @Override
        public void run() {
            SingletonMode04 ss = SingletonMode04.getInstance();
            ss.setName("zhangsan" + i++);
            System.out.println(Thread.currentThread().getName() + "正在执行。。。" + ss + " --- " + ss.getName());

        }
    }
}
