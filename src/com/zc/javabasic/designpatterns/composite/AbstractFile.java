package com.zc.javabasic.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-24
 */

public interface AbstractFile {
    /**
     * 杀毒
     */
    void killVirus();
}

/**
 * 相当于叶子组件
 */
class ImageFile implements AbstractFile{

    private String name;

    ImageFile(String name) {
        this.name = name;
    }

    /**
     * 杀毒
     */
    @Override
    public void killVirus() {
        System.out.println("图像文件:" + name + "，进行查杀");
    }
}

/**
 * 相当于叶子组件
 */
class TextFile implements AbstractFile{

    private String name;

    TextFile(String name) {
        this.name = name;
    }

    /**
     * 杀毒
     */
    @Override
    public void killVirus() {
        System.out.println("文本文件:" + name + "，进行查杀");
    }
}

/**
 * 相当于容器组件
 */
class Folder implements AbstractFile{

    private String name;
    /**
     * 定义容器，用来存放本容器构建的子节点
     */
    private List<AbstractFile> list = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile getChild(int index){
        return list.get(index);
    }

    /**
     * 杀毒
     */
    @Override
    public void killVirus() {
        System.out.println("文件夹：" + name + "，进行查杀");
        list.forEach(AbstractFile::killVirus);
    }
}