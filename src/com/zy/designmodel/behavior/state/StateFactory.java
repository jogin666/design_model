package com.zy.designmodel.behavior.state;

import com.zy.designmodel.behavior.state.core.BookState;
import com.zy.designmodel.behavior.state.core.CheckInState;
import com.zy.designmodel.behavior.state.core.FreeState;

public class StateFactory {

    public  static FreeState freeState;
    public  static BookState bookState;
    public  static CheckInState checkInState;

    static {
        freeState=new FreeState();
        bookState=new BookState();
        checkInState=new CheckInState();
    }
}
