package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Apple;
import com.yb.designpattern.entity.Banana;
import com.yb.designpattern.entity.Fruit;

/**
 * 没有入参，通过方法名字，区分创建的实体类。
 * 缺点，每次增加新的实体类，都需要加一个方法
 *
 * @author YB
 * @date 2019-01-01
 */
public class FruitFactory1 {

    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }

}
