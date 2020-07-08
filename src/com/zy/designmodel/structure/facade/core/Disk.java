package com.zy.designmodel.structure.facade.core;

public class Disk implements Operation{

    @Override
    public void startUp(){
        System.out.println("disk启动了");
    }

    @Override
    public void showDown(){
        System.out.println("disk关闭了");
    }
}
