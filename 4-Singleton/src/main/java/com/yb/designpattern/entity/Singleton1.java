package com.yb.designpattern.entity;

/**
 * 饿汉式，线程安全
 * 不常用，公有静态对象
 *
 * @author YB
 * @date 2019-01-01
 */
public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

}
