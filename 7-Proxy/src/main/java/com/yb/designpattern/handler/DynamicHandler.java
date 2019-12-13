package com.yb.designpattern.handler;

import com.yb.designpattern.entity.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，必须实现这个接口InvocationHandler
 *
 * @author YB
 * @date 2019-01-01
 */
public class DynamicHandler implements InvocationHandler {

    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        System.out.println("打折2");
        Object invoke = method.invoke(subject, args);
        System.out.println("赠代金券2");
        return invoke;
    }

}
