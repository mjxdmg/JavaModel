package com.yb.designpattern.factory;

import com.yb.designpattern.entity.Fruit;

/**
 * 水果工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public interface FruitFactory {

    /**
     * 获取苹果
     *
     * @return
     */
    Fruit getApple();

    /**
     * 获取香蕉
     *
     * @return
     */
    Fruit getBanana();

}
