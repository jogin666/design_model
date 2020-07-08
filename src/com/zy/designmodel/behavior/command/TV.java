package com.zy.designmodel.behavior.command;

public class TV {

    public void close(){
        System.out.println("关闭电视");
    }

    public void open(){
        System.out.println("打开电视");
    }

    public void changeChannel(int channel){
        System.out.println("更换"+channel+"频道");
    }
}
