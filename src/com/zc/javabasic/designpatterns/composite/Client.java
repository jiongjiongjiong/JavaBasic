package com.zc.javabasic.designpatterns.composite;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-24
 */

public class Client {

    public static void main(String[] args) {
        AbstractFile f2,f3;
        Folder f1 = new Folder("myTest");
        f2 = new ImageFile("myPic");
        f3 = new TextFile("myText");
        f1.add(f2);
        f1.add(f3);

        f1.killVirus();
    }
}
