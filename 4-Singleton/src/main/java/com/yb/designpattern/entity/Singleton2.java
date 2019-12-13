package com.yb.designpattern.entity;

/**
 * 饿汉式，线程安全
 * 不常用，静态代码块
 *
 * @author YB
 * @date 2019-01-01
 */
public class Singleton2 {

    public static final Singleton2 INSTANCE;

    //如果类的构造器中有复杂的操作，比如从配置文件中读取属性值赋给构造器，可以使用静态代码块
    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2() {
    }

}
