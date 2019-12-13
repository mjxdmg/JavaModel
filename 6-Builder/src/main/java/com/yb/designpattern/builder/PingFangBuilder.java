package com.yb.designpattern.builder;

import com.yb.designpattern.entity.House;

/**
 * 平房建造者
 *
 * @author YB
 * @date 2019-01-01
 */
public class PingFangBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房-->墙");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("平房-->房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}