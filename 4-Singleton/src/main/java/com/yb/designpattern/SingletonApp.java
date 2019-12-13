package com.yb.designpattern;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.yb.designpattern.entity.*;

import java.util.concurrent.*;

/**
 * Singleton单例模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class SingletonApp implements Runnable {

    /**
     * 实例化一个倒计数器,初始倒计数为10
     */
    static final CountDownLatch latch = new CountDownLatch(10);
    static final SingletonApp demo = new SingletonApp();

    @Override
    public void run() {
        try {
            //实例对象生成
            Singleton1 instance1 = Singleton1.INSTANCE;
            System.out.println(Thread.currentThread().getName() + instance1);
            Singleton2 instance2 = Singleton2.INSTANCE;
            System.out.println(Thread.currentThread().getName() + instance2);
            Singleton3 instance3 = Singleton3.getInstance();
            System.out.println(Thread.currentThread().getName() + instance3);
            Singleton4 instance4 = Singleton4.getInstance();
            System.out.println(Thread.currentThread().getName() + instance4);
            Singleton5 instance5 = Singleton5.getInstance();
            System.out.println(Thread.currentThread().getName() + instance5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //计数器进行减一
            latch.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().build();
        ExecutorService threadPool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            //启动线程
            threadPool.execute(demo);
        }

        //等待检查,阻塞main主线程,只有当CountDownLatch倒计数器为0时才会唤醒阻塞的main主线程
        latch.await();

        // 关闭线程池
        threadPool.shutdown();
    }

}
