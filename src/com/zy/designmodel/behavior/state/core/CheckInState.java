package com.zy.designmodel.behavior.state.core;

public class CheckInState extends StateImp{
    @Override
    public void checkOutRoom() {
        System.out.println("旅客退房");
    }
}
