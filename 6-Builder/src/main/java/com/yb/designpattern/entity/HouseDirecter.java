package com.yb.designpattern.entity;

import com.yb.designpattern.builder.HouseBuilder;

/**
 * 房屋设计者
 *
 * @author YB
 * @date 2019-01-01
 */
public class HouseDirecter {

    /**
     * 其实也没必要加一个属性，构造函数传参，
     * makeHouse方法加个入参就可以了
     */
    private HouseBuilder builder;

    public HouseDirecter(HouseBuilder builder) {
        this.builder = builder;
    }

    public void makeHourse() {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHousetop();
    }

}
