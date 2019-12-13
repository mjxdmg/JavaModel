package com.yb.designpattern;

import com.yb.designpattern.entity.Bags;
import com.yb.designpattern.entity.Goods;

/**
 * Composite组合模式
 *
 * @author YB
 * @date 2019-01-01
 */
public class CompositeApp {

    public static void main(String[] args) {
        float s;
        Goods goods;
        Bags bigBag = new Bags("大袋子");
        Bags mediumBag = new Bags("中袋子");
        Bags smallBag1 = new Bags("小袋子1");
        Bags smallBag2 = new Bags("小袋子2");
        goods = new Goods("商品1", 2, 7.9f);
        smallBag1.add(goods);
        goods = new Goods("商品2", 1, 9.9f);
        smallBag1.add(goods);
        mediumBag.add(smallBag1);
        goods = new Goods("商品3", 1, 380);
        mediumBag.add(goods);
        bigBag.add(mediumBag);
        goods = new Goods("商品4", 2, 68);
        smallBag2.add(goods);
        goods = new Goods("商品5", 3, 180);
        smallBag2.add(goods);
        bigBag.add(smallBag2);
        goods = new Goods("商品6", 1, 198);
        bigBag.add(goods);
        System.out.println("您选购的商品有：");
        bigBag.show();
        s = bigBag.calculation();
        System.out.println("要支付的总价是：" + s + "元");
    }

}
