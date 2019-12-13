package com.yb.designpatter.entity;

/**
 * 策略的外部封装类，根据不同策略执行不同行为，策略由外部环境决定
 *
 * @author YB
 * @date 2019-01-01
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        this.strategy.encrypt();
    }

}