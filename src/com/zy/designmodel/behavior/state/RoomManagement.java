package com.zy.designmodel.behavior.state;

public class RoomManagement {

    private State state;

    public RoomManagement(State state) {
        this.state = state;
    }

    //预定
    public void bookRoom() {
        state.bookRoom();
    }

    //退订
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    //入住
    public void checkInRoom() {
        state.checkInRoom();
    }

    //退房
    public void checkOutRoom() {
        state.checkOutRoom();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static void main(String args[]){
        RoomManagement management=new RoomManagement(StateFactory.freeState);
        management.bookRoom();
        management.setState(StateFactory.bookState);
        management.checkInRoom();
        management.setState(StateFactory.checkInState);
        management.checkOutRoom();
        management.setState(StateFactory.freeState);
    }
}
