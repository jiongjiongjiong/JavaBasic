package com.zc.javabasic.designpatterns.flyweight;

import static java.lang.System.out;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public class Client {

    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        out.println(chess1);
        out.println(chess2);
        out.println("增加位置信息");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
    }
}
