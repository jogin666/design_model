package com.zy.designmodel.behavior.state.core;

import com.zy.designmodel.behavior.state.State;

public abstract class StateImp implements State {
    @Override
    public void bookRoom() { }

    @Override
    public void unsubscribeRoom() { }

    @Override
    public void checkInRoom() { }

    @Override
    public void checkOutRoom() { }
}
