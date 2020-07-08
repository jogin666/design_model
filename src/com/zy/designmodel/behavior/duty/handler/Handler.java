package com.zy.designmodel.behavior.duty.handler;

import com.zy.designmodel.behavior.duty.model.Model;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor=successor;
    }

    public void handle(Model model){
        if (successor!=null){
            this.successor.handle(model);
        }else{
            System.out.println("12233");
        }
    }
}
