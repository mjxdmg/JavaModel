package com.yb.designpattern.entity;

/**
 * 对象适配器
 *
 * @author YB
 * @date 2019-01-01
 */
public class ObjectAdapter implements Target {

    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.doSomething();
    }

}
