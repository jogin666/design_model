package com.zy.designmodel.structure.facade.core;

public class CPU implements Operation {

    @Override
    public void startUp(){
        System.out.println("cpu启动了");
    }

    @Override
    public void showDown(){
        System.out.println("cpu关闭了");
    }
}
