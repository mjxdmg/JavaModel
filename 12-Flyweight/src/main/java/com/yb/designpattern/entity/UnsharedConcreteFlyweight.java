package com.yb.designpattern.entity;

/**
 * 非享元具体类
 *
 * @author YB
 * @date 2019-01-01
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
