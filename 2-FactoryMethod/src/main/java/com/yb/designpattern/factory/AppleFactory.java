package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Apple;
import com.yb.designpattern.entity.Fruit;

/**
 * 苹果工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

}
