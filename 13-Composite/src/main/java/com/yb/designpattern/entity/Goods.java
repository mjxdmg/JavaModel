package com.yb.designpattern.entity;

/**
 * 物品
 *
 * @author YB
 * @date 2019-01-01
 */
public class Goods implements Articles {

    private String name;
    private int quantity;
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }

}