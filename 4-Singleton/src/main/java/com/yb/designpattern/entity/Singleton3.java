package com.yb.designpattern.entity;

/**
 * 饿汉式，线程安全
 * 常用，私有静态对象
 *
 * @author YB
 * @date 2019-01-01
 */
public class Singleton3 {

    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

}
