package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Fruit;
import com.yb.designpattern.entity.NorthApple;
import com.yb.designpattern.entity.NorthBanana;

/**
 * 北方水果工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public class NorthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }

}
