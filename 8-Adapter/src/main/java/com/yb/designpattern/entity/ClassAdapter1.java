package com.yb.designpattern.entity;

/**
 * 类适配器1
 *
 * @author YB
 * @date 2019-01-01
 */
public class ClassAdapter1 extends Adapter1 implements Target {

    @Override
    public void request() {
        doSomething();
    }

}
