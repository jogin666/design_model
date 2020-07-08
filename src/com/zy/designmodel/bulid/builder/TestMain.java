package com.zy.designmodel.bulid.builder;

import com.zy.designmodel.bulid.builder.bulid.ProductionBulider;
import com.zy.designmodel.bulid.builder.bulid.FristProductionBuliderImp;
import com.zy.designmodel.bulid.builder.bulid.SecondProductionBuliderImp;
import com.zy.designmodel.bulid.builder.director.Director;

public class TestMain {
    public static void main(String args[]) {
        ProductionBulider builderOne = new FristProductionBuliderImp();
        Director directorOne = new Director(builderOne);
        System.out.println(directorOne.createrProduction());

        ProductionBulider buliderTwo=new SecondProductionBuliderImp();
        Director directorTwo=new Director(buliderTwo);
        System.out.println(directorTwo.createrProduction());
    }
}
