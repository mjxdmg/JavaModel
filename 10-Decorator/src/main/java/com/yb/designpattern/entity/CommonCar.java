package com.yb.designpattern.entity;

/**
 * 通用车
 *
 * @author YB
 * @date 2019-01-01
 */
public class CommonCar implements Car {

    @Override
    public void run() {
        System.out.println("车会跑");
    }

}
