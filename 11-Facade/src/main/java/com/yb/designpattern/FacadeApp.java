package com.yb.designpattern;

/**
 * Facade外观模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class FacadeApp {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doABC();
        System.out.println("------------");

        facade.doAC();
        System.out.println("------------");
    }

}
