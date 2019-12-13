package com.yb.designpattern.entity;

/**
 * 抽象角色
 * 真实对象与静态代理对象都需要实现的接口
 *
 * @author YB
 * @date 2019-01-01
 */
public interface Subject {

    /**
     * 卖书
     *
     * @param bookName 书名
     * @param money    金额
     */
    void sailBook(String bookName, Double money);

}
