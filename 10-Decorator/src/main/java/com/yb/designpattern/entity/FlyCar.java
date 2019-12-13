package com.yb.designpattern.entity;

/**
 * 装饰者，会飞的car
 *
 * @author YB
 * @date 2019-01-01
 */
public class FlyCar extends DecoratorCar {

    public FlyCar(Car car) {
        super(car);
    }

    @Override
    public void run() {
        fly();
        this.getCar().run();
    }

    private void fly() {
        System.out.println("车会飞");
    }

}
