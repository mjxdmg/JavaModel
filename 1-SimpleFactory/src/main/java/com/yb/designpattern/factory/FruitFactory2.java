package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Apple;
import com.yb.designpattern.entity.Banana;
import com.yb.designpattern.entity.Fruit;

/**
 * 入参为实体类名称的字符串
 * 缺点，每次增加一个新的实体类，都需要加一个判断
 *
 * @author YB
 * @date 2019-01-01
 */
public class FruitFactory2 {

    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
        if ("apple".equalsIgnoreCase(type)) {
            return new Apple();
        } else if ("banana".equalsIgnoreCase(type)) {
            return new Banana();
        } else {
            return null;
        }
    }

}
