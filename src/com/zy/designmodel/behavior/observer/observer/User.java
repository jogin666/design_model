package com.zy.designmodel.behavior.observer.observer;

public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receive(String message) {
        read(message);
    }

    public void read(String message){
        System.out.println(name+"阅读"+message);
    }
}
