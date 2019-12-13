package com.yb.designpattern;

import com.yb.designpattern.entity.Car;
import com.yb.designpattern.entity.CommonCar;
import com.yb.designpattern.entity.FlyCar;
import com.yb.designpattern.entity.SwimCar;

/**
 * Decorator装饰模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class DecoratorApp {

    public static void main(String[] args) {
        //普通car
        Car commonCar = new CommonCar();
        commonCar.run();
        System.out.println("------------");

        //会飞的car
        Car flyCar = new FlyCar(commonCar);
        flyCar.run();
        System.out.println("------------");

        //会游泳的car
        Car swimCar = new SwimCar(commonCar);
        swimCar.run();
        System.out.println("------------");

        //既会飞又会游泳的car
        Car flySwimCar = new SwimCar(flyCar);
        flySwimCar.run();
    }

}
