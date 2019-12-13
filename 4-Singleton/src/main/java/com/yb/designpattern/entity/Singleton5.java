package com.yb.designpattern.entity;

/**
 * 懒汉式，线程不安全
 * 解决方案，同步代码块，必须双重验证
 *
 * @author YB
 * @date 2019-01-01
 */
public class Singleton5 {

    /**
     * 使用volatile保证线程有序性
     */
    private static volatile Singleton5 instance = null;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        //第一次校验：由于单例模式只需要创建一次实例，如果后面再次调用getInstance方法时，则直接返回之前创建的实例，提高了性能。
        if (instance == null) {
            synchronized (Singleton5.class) {
                //第二次校验：如果没有第二次校验，假设线程t1执行了第一次校验后，判断为null，这时t2也获取了CPU执行权，也执行了第一次校验，判断也为null。
                //接下来t2获得锁，创建实例。
                //这时t1又获得CPU执行权，直接创建实例。
                if (instance == null) {
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、设置lazyDoubleCheckSingleton，指向刚分配的内存地址
                    //由于2，3顺序可能会发生重排序，所以变量用volatile修饰，防止重排序
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
