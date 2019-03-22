package com.zc.javabasic.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-20
 */

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Map<String,String> map = new HashMap<>(16);
//        map.put("1","a");
//        System.out.println(map);
        Robot firstRobot = new Robot("Droid#1");
        Robot secondRobot = (Robot) firstRobot.clone();


        System.out.println(firstRobot == secondRobot);
        System.out.println(firstRobot.getName()+"'"
                        +" but was '"+secondRobot.getName()+"'" + "===" +
                secondRobot.getName().equals(firstRobot.getName()));
    }

    static class Robot implements Cloneable {
        private String name;

        public Robot(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
