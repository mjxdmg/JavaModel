package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Fruit;

/**
 * 通过反射获取，新增实体类无影响
 *
 * @author YB
 * @date 2019-01-01
 */
public class FruitFactory3 {

    public static Fruit getFruit(String type) throws Exception {
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }

}
