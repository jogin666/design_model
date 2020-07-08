package com.zy.designmodel.behavior.state.core;

public class BookState extends StateImp {
    @Override
    public void bookRoom() {
        System.out.println("房间已经被预定了！");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("旅客退订房间");
    }

    @Override
    public void checkInRoom() {
        System.out.println("旅客入住");
    }
}
