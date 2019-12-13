package com.yb.designpattern;

import com.yb.designpattern.entity.FlyWeight;
import com.yb.designpattern.entity.FlyWeightFactory;
import com.yb.designpattern.entity.UnsharedConcreteFlyweight;

/**
 * Flyweight享元模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class FlyweightApp {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight f01 = factory.getFlyWeight("a");
        FlyWeight f02 = factory.getFlyWeight("a");
        FlyWeight f03 = factory.getFlyWeight("a");
        FlyWeight f11 = factory.getFlyWeight("b");
        FlyWeight f12 = factory.getFlyWeight("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }

}
