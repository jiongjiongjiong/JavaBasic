package com.zc.javabasic.designpatterns.prototype;

import java.util.Date;

/**
 * @description:
 * @author: Zhangc
 * @date: 2018-12-20
 */

public class Sheep implements Cloneable {
    private String sname;
    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }

    protected Object deepClone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }
}
