package com.zy.designmodel.behavior.state;

public interface State {
     //预订
     void bookRoom();
     //退订房间
     void unsubscribeRoom();
     //入住
     void checkInRoom();
     //退房
     void checkOutRoom();
}
