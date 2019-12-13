package com.yb.designpattern;

import com.yb.designpattern.entity.Fruit;
import com.yb.designpattern.factory.FruitFactory;
import com.yb.designpattern.factory.NorthFruitFactory;
import com.yb.designpattern.factory.SouthFruitFactory;

/**
 * AbstractFactory抽象工厂模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class AbstractFactoryApp {

    public static void main(String[] args) {
        //用来创建北方水果的工厂
        FruitFactory fruitFactory1 = new NorthFruitFactory();
        Fruit apple1 = fruitFactory1.getApple();
        apple1.get();
        Fruit banana1 = fruitFactory1.getBanana();
        banana1.get();
        System.out.println("-------------");

        //用来创建南方水果的工厂
        FruitFactory fruitFactory2 = new SouthFruitFactory();
        Fruit apple2 = fruitFactory2.getApple();
        apple2.get();
        Fruit banana2 = fruitFactory2.getBanana();
        banana2.get();
        System.out.println("-------------");
    }

}
