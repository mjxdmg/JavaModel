package com.yb.designpattern;

import com.yb.designpattern.builder.GongyuBuilder;
import com.yb.designpattern.builder.HouseBuilder;
import com.yb.designpattern.builder.PingFangBuilder;
import com.yb.designpattern.entity.House;
import com.yb.designpattern.entity.HouseDirecter;

/**
 * Builder建造者模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class BuilderApp {

    public static void main(String[] args) {
        //直接造房子
        House house = new House();
        house.setFloor("地板");
        house.setHousetop("房顶");
        house.setWall("墙");
        System.out.println(house.toString());
        System.out.println("-------------");

        //由工程对来修
        HouseBuilder builder1 = new PingFangBuilder();
        builder1.makeFloor();
        builder1.makeHousetop();
        builder1.makeWall();
        House house1 = builder1.getHouse();
        System.out.println(house1.toString());
        System.out.println("-------------");

        HouseBuilder builder2 = new GongyuBuilder();
        builder2.makeFloor();
        builder2.makeHousetop();
        builder2.makeWall();
        House house2 = builder2.getHouse();
        System.out.println(house2.toString());
        System.out.println("-------------");

        //由设计者来做
        HouseDirecter directer1 = new HouseDirecter(builder1);
        directer1.makeHourse();
        System.out.println(builder1.getHouse().toString());
        System.out.println("-------------");

        //由设计者来做
        HouseDirecter directer2 = new HouseDirecter(builder2);
        directer2.makeHourse();
        System.out.println(builder2.getHouse().toString());
        System.out.println("-------------");
    }

}
