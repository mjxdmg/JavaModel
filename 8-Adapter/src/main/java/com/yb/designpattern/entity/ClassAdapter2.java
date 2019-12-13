package com.yb.designpattern.entity;

/**
 * 类是哦亲2
 *
 * @author YB
 * @date 2019-01-01
 */
public class ClassAdapter2 extends Adapter2 implements Target {

    @Override
    public void request() {
        doSomething();
    }

}
