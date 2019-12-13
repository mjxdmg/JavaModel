package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Fruit;
import com.yb.designpattern.entity.SouthApple;
import com.yb.designpattern.entity.SouthBanana;

/**
 * 南方水果工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public class SouthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }

}
