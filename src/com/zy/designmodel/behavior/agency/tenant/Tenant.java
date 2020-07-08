package com.zy.designmodel.behavior.agency.tenant;

public class Tenant implements Tenants {

    public Tenant(){}

    @Override
    public void rend(){
        System.out.println("租客要租房");
    }

    @Override
    public void visitHouse(){
        System.out.println("租客看房");
    }

    @Override
    public void giveMoney(){
        System.out.println("租客交钱！");
    }
}
