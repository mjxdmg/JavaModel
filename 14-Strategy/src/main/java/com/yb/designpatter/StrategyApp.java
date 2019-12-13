package com.yb.designpatter;

import com.yb.designpatter.entity.ABSStrategy;
import com.yb.designpatter.entity.Context;
import com.yb.designpatter.entity.MD5Strategy;

/**
 * Strategy策略模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class StrategyApp {

    public static void main(String[] args) {
        Context context1 = new Context(new MD5Strategy());
        context1.encrypt();
        System.out.println("------------");

        Context context2 = new Context(new ABSStrategy());
        context2.encrypt();
        System.out.println("------------");
    }

}