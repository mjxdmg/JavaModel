package com.yb.designpattern.entity;

/**
 * 真实角色
 *
 * @author YB
 * @date 2019-01-01
 */
public class RealSubject implements Subject {

    @Override
    public void sailBook(String bookName, Double money) {
        System.out.println(bookName + "-" + money + "元");
    }

}
