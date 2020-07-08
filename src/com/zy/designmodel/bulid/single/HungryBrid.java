package com.zy.designmodel.bulid.single;

public class HungryBrid {
    private static HungryBrid brid=new HungryBrid();

    private HungryBrid(){ }

    public static HungryBrid getInstance(){
        return brid;
    }
}
