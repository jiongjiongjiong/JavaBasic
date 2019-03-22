package com.zc.javabasic.designpatterns.iterator;

/**
 * @description: 自定义迭代器接口
 * @author: Zhangc
 * @date: 2018-12-28
 */

public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    /**
     * 获取当前游标指向的对象
     * @return
     */
    Object getCurrentObj();
}
