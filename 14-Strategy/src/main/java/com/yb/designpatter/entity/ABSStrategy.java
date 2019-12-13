package com.yb.designpatter.entity;

/**
 * ABS策略
 *
 * @author YB
 * @date 2019-01-01
 */
public class ABSStrategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("执行ABS加密");
    }

}