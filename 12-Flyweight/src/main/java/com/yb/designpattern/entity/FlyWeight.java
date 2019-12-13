package com.yb.designpattern.entity;

/**
 * 享元接口
 *
 * @author YB
 * @date 2019-01-01
 */
public interface FlyWeight {

    void operation(UnsharedConcreteFlyweight state);

}
