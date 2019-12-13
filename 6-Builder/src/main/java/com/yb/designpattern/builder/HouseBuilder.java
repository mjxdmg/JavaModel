package com.yb.designpattern.builder;

import com.yb.designpattern.entity.House;

/**
 * 房屋建造者
 *
 * @author YB
 * @date 2019-01-01
 */
public interface HouseBuilder {

    /**
     * 修地板
     */
    void makeFloor();

    /**
     * 修墙
     */
    void makeWall();

    /**
     * 修屋顶
     */
    void makeHousetop();

    /**
     * 打印对象
     *
     * @return 房屋
     */
    House getHouse();

}
