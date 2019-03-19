package com.zc.javabasic.queue;



import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-19
 */

public class BlockingQueueDemo {
    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    public static void main(String[] args) {
        BlockingQueueDemo queueDemo = new BlockingQueueDemo();
        Producer producer = queueDemo.new Producer();
        Consumer consumer = queueDemo.new Consumer();
        producer.start();
        consumer.start();
    }

    class Consumer extends Thread{
        @Override
        public void run() {
            consume();
        }

        private void consume() {
            while(true){
                try {
                    queue.take();
                    System.out.println("从队列取走一个元素，队列剩余"+queue.size()+"个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while(true){
                try {
                    queue.put(1);
                    System.out.println("向队列取中插入一个元素，队列剩余空间："+(queueSize-queue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
