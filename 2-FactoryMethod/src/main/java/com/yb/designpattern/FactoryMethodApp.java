package com.yb.designpattern;

import com.yb.designpattern.entity.Fruit;
import com.yb.designpattern.factory.AppleFactory;
import com.yb.designpattern.factory.BananaFactory;
import com.yb.designpattern.factory.FruitFactory;

/**
 * FactoryMethod工厂方法模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class FactoryMethodApp {

    public static void main(String[] args) {
        //获得AppleFactory
        FruitFactory fruitFactory1 = new AppleFactory();
        Fruit apple = fruitFactory1.getFruit();
        apple.get();
        System.out.println("-------------");

        //获得BananaFactory
        FruitFactory fruitFactory2 = new BananaFactory();
        Fruit banana = fruitFactory2.getFruit();
        banana.get();
        System.out.println("-------------");
    }

}
