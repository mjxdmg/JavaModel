package com.yb.designpattern.entity;

/**
 * 房屋
 *
 * @author YB
 * @date 2019-01-01
 */
public class House {

    private String floor;
    private String wall;
    private String housetop;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", housetop='" + housetop + '\'' +
                '}';
    }

}
