package com.zc.javabasic.thread;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SyncThread implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.startsWith("A")){
            async();
        }else if (threadName.startsWith("B")){
            syncObjectBlock1();
        }else if (threadName.startsWith("C")){
            syncObjectMethod1();
        }else if (threadName.startsWith("D")){
            syncObjectBlock1();
        }else if (threadName.startsWith("E")){
            syncObjectMethod1();
        }
    }

    /**
     * 对象实例锁
     * synchronized 修饰非静态方法
     */
    private synchronized void syncObjectMethod1() {
        System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "_SyncObjectMethod1_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * 对象实例锁
     * 方法中有synchronized(this|object){} 同步代码块
     */
    private void syncObjectBlock1() {
        System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized(this){
            try {
                System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "_SyncObjectBlock1_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }catch ( InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 异步方法
     */
    private void async() {
        try {
            System.out.println(Thread.currentThread().getName() + "_Async_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "_Async_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date() ));
        }catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * 类锁
     */
    private void syncClassblock1(){
        System.out.println(Thread.currentThread().getName() + "_SyncClassBlock1: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized(SyncThread.class){
            try {
                System.out.println(Thread.currentThread().getName() + "_SyncClassBlock1_Start: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "_SyncClassBlock1_End: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private synchronized static void syncClassMethod1(){

    }
}
