package com.yb.designpattern.entity;

/**
 * 抽象化角色：包
 *
 * @author YB
 * @date 2019-01-01
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 打印名称
     *
     * @return 名称
     */
    public abstract String getName();

}
