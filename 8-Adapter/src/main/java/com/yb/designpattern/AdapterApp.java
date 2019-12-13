package com.yb.designpattern;

import com.yb.designpattern.entity.*;

/**
 * Adapter适配器模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class AdapterApp {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        new ClassAdapter1().request();
        new ClassAdapter2().request();
        System.out.println("------------");

        System.out.println("对象适配器模式测试：");
        Adapter adapter1 = new Adapter1();
        new ObjectAdapter(adapter1).request();
        Adapter adapter2 = new Adapter2();
        new ObjectAdapter(adapter2).request();
        System.out.println("------------");
    }

}
