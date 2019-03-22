package com.zc.javabasic.designpatterns.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @description: 自定义的聚合类
 * @author: Zhangc
 * @date: 2018-12-28
 */

public class ConcreteAggregate {

    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate() {

    }

    public void addObject(Object obj){
        this.list.add(obj);
    }

    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    /**
     * 获取迭代器
     * @return
     */
    public MyIterator createIteratro(){
        return new ConcreteIterator();
    }

    /**
     * 获取迭代器
     */
    private class ConcreteIterator implements MyIterator{

        /**
         * 定义游标，记录遍历时的位置
         */
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            return (list.size() - 1) == cursor ? true : false;
        }

        /**
         * 获取当前游标指向的对象
         *
         * @return
         */
        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
