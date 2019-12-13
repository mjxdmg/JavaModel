package com.yb.designpattern;

import com.yb.designpattern.entity.RealSubject;
import com.yb.designpattern.entity.Subject;
import com.yb.designpattern.handler.DynamicHandler;
import com.yb.designpattern.handler.ProxyHandler;

import java.lang.reflect.Proxy;

/**
 * Proxy代理模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class ProxyApp {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        //静态代理
        ProxyHandler proxy = new ProxyHandler();
        proxy.setSubject(realSubject);
        proxy.sailBook("书", 20.00);
        System.out.println("------------");

        //动态代理
        DynamicHandler dynamic = new DynamicHandler();
        dynamic.setSubject(realSubject);
        /**
         * 由哪个ClassLoader对象来对生成的代理对象进行加载
         * 这个代理类要继承的接口
         * 把代理类实例与handler关联,当动态代理类在调用方法的时候，会关联到这个对象上，invoke方法
         */
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), dynamic);
        proxySubject.sailBook("书", 20.00);
        System.out.println("------------");
    }

}
