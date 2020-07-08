package com.zy.designmodel.behavior.state.core;

public class FreeState extends StateImp{
    @Override
    public void bookRoom() {
        System.out.println("您已预定了房间！");
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住该房间！");
    }
}
