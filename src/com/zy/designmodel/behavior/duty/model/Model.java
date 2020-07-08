package com.zy.designmodel.behavior.duty.model;

public abstract class Model {

    private String type;

    public Model(){

    }

    public Model(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
