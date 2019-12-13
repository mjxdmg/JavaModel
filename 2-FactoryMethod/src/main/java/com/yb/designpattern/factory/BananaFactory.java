package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Banana;
import com.yb.designpattern.entity.Fruit;

/**
 * 香蕉工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public class BananaFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

}
