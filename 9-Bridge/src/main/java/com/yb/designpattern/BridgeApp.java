package com.yb.designpattern;

import com.yb.designpattern.entity.*;

/**
 * Bridge桥接模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class BridgeApp {

    public static void main(String[] args) {
        Bag bag1 = new HandBag();
        bag1.setColor(new Red());
        System.out.println(bag1.getName());
        System.out.println("------------");

        Bag bag2 = new Wallet();
        bag2.setColor(new Yellow());
        System.out.println(bag2.getName());
        System.out.println("------------");
    }

}
