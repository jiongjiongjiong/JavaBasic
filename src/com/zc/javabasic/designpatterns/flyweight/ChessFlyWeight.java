package com.zc.javabasic.designpatterns.flyweight;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-27
 */

public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}


class ConcreteChess implements ChessFlyWeight{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("颜色：" + color + " 位置：" + coordinate.getX() + " --- " + coordinate.getY());
    }

    @Override
    public String toString() {
        return "ConcreteChess{" +
                "color='" + color + '\'' +
                '}';
    }
}