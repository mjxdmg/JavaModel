package com.yb.designpattern.builder;

import com.yb.designpattern.entity.House;

/**
 * 公寓建造者
 *
 * @author YB
 * @date 2019-01-01
 */
public class GongyuBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓-->墙");
    }

    @Override
    public void makeHousetop() {
        house.setHousetop("公寓-->房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
