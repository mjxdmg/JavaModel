package com.yb.designpattern;

import com.yb.designpattern.entity.Person;
import com.yb.designpattern.observer.BirthdayObserver;

/**
 * Observer观察者模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class ObserverApp {

    public static void main(String[] args) {
        Person person = new Person();

        //添加观察者
        person.addObserver(new BirthdayObserver());
        person.setName("小红");
        person.setAge(17);
        person.setAge(18);

        //删除所有观察者
        person.deleteObservers();
        person.setAge(19);
    }

}