package com.zy.designmodel.structure.decoration;

import com.zy.designmodel.structure.decoration.dao.Pancake;
import com.zy.designmodel.structure.decoration.dao.imp.MeatPancake;
import com.zy.designmodel.structure.decoration.dao.imp.TornCake;
import com.zy.designmodel.structure.decoration.decorationClass.Egg;
import com.zy.designmodel.structure.decoration.decorationClass.Ham;

public class Test {

    public static void main(String args[]){
        Pancake tornCake = new TornCake();
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getName(), tornCake.getPrice()));

        Pancake meatPancake = new MeatPancake();
        meatPancake = new Egg(meatPancake);
        meatPancake = new Ham(meatPancake);
        //我好饿
        System.out.println(String.format("%s ￥%s", meatPancake.getName(), meatPancake.getPrice()));
    }
}
