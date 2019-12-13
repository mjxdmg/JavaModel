package com.yb.designpattern.entity;

/**
 * 装饰者，会游泳的car
 *
 * @author YB
 * @date 2019-01-01
 */
public class SwimCar extends DecoratorCar {

    public SwimCar(Car car) {
        super(car);
    }

    @Override
    public void run() {
        swim();
        this.getCar().run();
    }

    private void swim() {
        System.out.println("车会游泳");
    }

}
