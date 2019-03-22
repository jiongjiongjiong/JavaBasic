package com.zc.javabasic.designpatterns.singleton;

import java.util.concurrent.*;

/**
 * @description: 多线程环境下各种单例的效率
 * @author: Zhangc
 * @date: 2018-12-17
 */

public class client3 {

    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,20,200, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
        ExecutorService es = Executors.newFixedThreadPool(2);
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long start = System.currentTimeMillis();
        for (int i=0;i< threadNum; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j< 100000 ; j++){
                        SingletonMode01 s1 = SingletonMode01.getInstance();  //19
//                        SingletonMode02 s2 = SingletonMode02.getInstance();  //81
//                        SingletonMode03 s3 = SingletonMode03.getInstance();  // 25
//                        SingletonMode04 s4 = SingletonMode04.getInstance(); // 26
//                        SingletonMode05 s5 = SingletonMode05.INSTANCE; //17
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
