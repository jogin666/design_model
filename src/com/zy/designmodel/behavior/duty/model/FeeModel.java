package com.zy.designmodel.behavior.duty.model;

public class FeeModel extends Model{

    public static final String type="fee";

    public FeeModel() {
        super(type);
    }

    private String username;
    private Double fee;

    public FeeModel(String username, Double fee) {
        super(type);
        this.username = username;
        this.fee = fee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
