package com.zc.javabasic.designpatterns.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * @description: 享元工厂
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class ChessFlyWeightFactory {
    /**
     * 享元池
     */
    private static Map<String,ChessFlyWeight> map = new HashMap(16);

    public static ChessFlyWeight getChess(String color){
        if (map.get(color) != null ){
            return map.get(color);
        }
        ChessFlyWeight cfw  = new ConcreteChess(color);
        map.put(color,cfw);
        return cfw;
    }
}
