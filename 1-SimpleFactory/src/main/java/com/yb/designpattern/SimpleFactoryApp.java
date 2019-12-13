package com.yb.designpattern;

import com.yb.designpattern.entity.Apple;
import com.yb.designpattern.entity.Banana;
import com.yb.designpattern.entity.Fruit;
import com.yb.designpattern.factory.FruitFactory1;
import com.yb.designpattern.factory.FruitFactory2;
import com.yb.designpattern.factory.FruitFactory3;

/**
 * SimpleFactory简单工厂模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class SimpleFactoryApp {

    public static void main(String[] args) throws Exception {
        Fruit apple1 = new Apple();
        Fruit banana1 = new Banana();
        apple1.get();
        banana1.get();
        System.out.println("-------------");

        //第一个工厂
        Fruit apple2 = FruitFactory1.getApple();
        Fruit banana2 = FruitFactory1.getBanana();
        apple2.get();
        banana2.get();
        System.out.println("-------------");

        //第二个工厂
        Fruit apple3 = FruitFactory2.getFruit("apple");
        if (apple3 != null) {
            apple3.get();
        }
        Fruit banana3 = FruitFactory2.getFruit("banana");
        if (banana3 != null) {
            banana3.get();
        }
        System.out.println("-------------");


        //第三个工厂
        Fruit fruit = FruitFactory3.getFruit(Apple.class.getName());
        fruit.get();
        fruit = FruitFactory3.getFruit(Banana.class.getName());
        fruit.get();
        System.out.println("-------------");
    }

}
