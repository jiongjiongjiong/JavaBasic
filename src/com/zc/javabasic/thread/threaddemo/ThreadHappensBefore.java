package com.zc.javabasic.thread.threaddemo;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-21
 */

public class ThreadHappensBefore {
    private static int var = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread B = new Thread(()->{
            // 主线程调用 B.start() 之前
            // 所有对共享变量的修改，此处皆可见
            // 此例中，var==77
            System.out.println("thread running...");
            System.out.println("var0 :" + var);
            var = 33;
        });
        System.out.println("var1 :" + var);
        // 此处对共享变量 var 修改
        var = 77;
        // 主线程启动子线程
        B.start();
        B.join();
        System.out.println("var2 :" + var);
    }
}
