package com.zy.designmodel.behavior.observer.observerable;

import com.zy.designmodel.behavior.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeChatServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WeChatServer(){
        list=new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        try {
            for (Observer observer : list) {
                observer.receive(message);
            }
        }catch (NullPointerException e){

        }
    }

    public void sendMessage(String message){
        this.message=message;
        notifyObserver();
    }
}
