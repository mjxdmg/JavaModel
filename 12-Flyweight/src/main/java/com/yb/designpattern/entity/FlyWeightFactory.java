package com.yb.designpattern.entity;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 *
 * @author YB
 * @date 2019-01-01
 */
public class FlyWeightFactory {

    private static ConcurrentHashMap<String, FlyWeight> flyWeights = new ConcurrentHashMap<>();

    /**
     * 通过内部状态name保存对象，如果外部状态改变，会导致线程不安全问题
     */
    public FlyWeight getFlyWeight(String key) {
        if (flyWeights.get(key) == null) {
            synchronized (FlyWeightFactory.class) {
                if (flyWeights.get(key) == null) {
                    FlyWeight flyWeight = new ConcreteFlyweight(key);
                    flyWeights.put(key, flyWeight);
                }
            }
        }
        return flyWeights.get(key);
    }

}
