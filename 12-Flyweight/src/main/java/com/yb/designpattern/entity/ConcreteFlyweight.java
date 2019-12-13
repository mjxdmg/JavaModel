package com.yb.designpattern.entity;

/**
 * 享元具体类
 *
 * @author YB
 * @date 2019-01-01
 */
public class ConcreteFlyweight implements FlyWeight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }

}
