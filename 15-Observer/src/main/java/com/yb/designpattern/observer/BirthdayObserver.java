package com.yb.designpattern.observer;

import com.yb.designpattern.entity.Person;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，需要继承 java.util.Observer 这个类
 *
 * @author YB
 * @date 2019-01-01
 */
public class BirthdayObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Person person = (Person) arg;
        System.out.println("祝 " + person.getName() + " " + person.getAge() + "岁生日快乐");
    }

}