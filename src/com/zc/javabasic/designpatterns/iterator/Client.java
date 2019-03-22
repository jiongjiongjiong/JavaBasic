package com.zc.javabasic.designpatterns.iterator;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-28
 */

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate cma = new ConcreteAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator iteratro = cma.createIteratro();
        while (iteratro.hasNext()){
            System.out.println(iteratro.getCurrentObj());
            iteratro.next();
        }
    }
}
