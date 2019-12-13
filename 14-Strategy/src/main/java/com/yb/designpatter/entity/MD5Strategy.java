package com.yb.designpatter.entity;

/**
 * MD5策略
 *
 * @author YB
 * @date 2019-01-01
 */
public class MD5Strategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("执行MD5加密");
    }

}