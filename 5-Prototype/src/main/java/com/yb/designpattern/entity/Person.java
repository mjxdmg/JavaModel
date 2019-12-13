package com.yb.designpattern.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 人类
 *
 * @author YB
 * @date 2019-01-01
 */
public class Person implements Cloneable {

    private String name;
    private int age;
    private List<String> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    @Override
    public Person clone() {
        try {
            //浅拷贝
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Person clone2() {
        try {
            //深拷贝
            Person clonePerson = (Person) super.clone();
            List<String> cars2 = new ArrayList<>();
            cars2.addAll(this.getCars());
            clonePerson.setCars(cars2);
            return clonePerson;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

}
