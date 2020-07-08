package com.zy.designmodel.behavior.agency.lease;

public class Lessor implements Lessors {

    public Lessor(){ }

    @Override
    public void lease(){
        System.out.println("公告出租房子");
    }

    @Override
    public void giveKey(){
        System.out.println("给租客钥匙");
    }
}
