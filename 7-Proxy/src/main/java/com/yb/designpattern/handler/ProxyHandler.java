package com.yb.designpattern.handler;

import com.yb.designpattern.entity.RealSubject;
import com.yb.designpattern.entity.Subject;

import java.util.Objects;

/**
 * 静态代理角色，要接收真实的角色，
 * 然后再进行进一步封装
 *
 * @author YB
 * @date 2019-01-01
 */
public class ProxyHandler implements Subject {

    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sailBook(String bookName, Double money) {
        if (Objects.isNull(subject)) {
            subject = new RealSubject();
        }
        System.out.println("打折1");
        subject.sailBook(bookName, money);
        System.out.println("返优惠券1");
    }

}
