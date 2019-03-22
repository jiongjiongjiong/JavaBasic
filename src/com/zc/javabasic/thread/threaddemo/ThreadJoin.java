package com.zc.javabasic.thread.threaddemo;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-21
 */

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        System.out.println("MyThread is starting...");
        t.join();
//        Thread.sleep(1000);
        System.out.println("main is over...");
    }

    static class MyThread extends Thread{

        public void run(){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mythread is running...");
        }
    }
}
