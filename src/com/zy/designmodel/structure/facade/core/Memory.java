package com.zy.designmodel.structure.facade.core;

public class Memory implements Operation{

    @Override
    public void startUp(){
        System.out.println("memory启动了");
    }

    @Override
    public void showDown(){
        System.out.println("memory关闭了");
    }
}
