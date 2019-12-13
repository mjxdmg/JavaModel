package com.yb.designpattern.entity;

/**
 * 扩展抽象化角色：挎包
 *
 * @author YB
 * @date 2019-01-01
 */
public class HandBag extends Bag {

    @Override
    public String getName() {
        return color.getColor() + "-HandBag";
    }

}
