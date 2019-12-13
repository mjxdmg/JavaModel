package com.yb.designpattern.entity;

import java.util.Observable;

/**
 * Person类作为被观察者，需要继承java.util.Observable这个类
 *
 * @author YB
 * @date 2019-01-01
 */
public class Person extends Observable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /**
     * 当姓名改变的时候，通知观察者
     */
    public void setAge(int age) {
        this.age = age;
        //标记为改变了
        this.setChanged();
        //通知观察者，可以传参数也可以不传
        this.notifyObservers(this);
    }

}