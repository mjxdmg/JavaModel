package com.yb.designpattern;

import com.yb.designpattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype原型模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class PrototypeApp {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("小小");
        person1.setAge(25);
        List<String> cars1 = new ArrayList<>();
        cars1.add("宝马");
        cars1.add("奔驰");
        person1.setCars(cars1);
        System.out.println("person1=" + person1);

        //默认浅克隆，复制的引用，没有对属性创建新的对象
        Person clonePerson1 = person1.clone();
        cars1.add("大众");
        System.out.println("clonePerson1=" + clonePerson1);
        System.out.println("person1=" + person1);
        System.out.println("-------------");

        Person person2 = new Person();
        person2.setName("小小");
        person2.setAge(25);
        List<String> cars2 = new ArrayList<>();
        cars2.add("宝马");
        cars2.add("奔驰");
        person2.setCars(cars2);
        System.out.println("person2=" + person2);

        //深克隆
        Person clonePerson2 = person2.clone2();
        cars2.add("大众");
        System.out.println("clonePerson2=" + clonePerson2);
        System.out.println("person2=" + person2);
        System.out.println("-------------");
    }

}
