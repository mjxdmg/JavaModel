package com.yb.designpattern.entity;

/**
 * 懒汉式，线程不安全
 * 解决方案，同步方法
 *
 * @author YB
 * @date 2019-01-01
 */
public class Singleton4 {

    /**
     * 使用volatile保证线程有序性
     */
    private static volatile Singleton4 instance = null;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

}
