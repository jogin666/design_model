package com.zy.designmodel.behavior.serviceAgency.service;

public class ServiceManagement {

    private final String UserService="UserService";
    private final String BossService="BossService";

    public Service getBusnessService(String type){
        if (UserService.equals(type)){
            return new UserService();
        }else if (BossService.equals(type)){
            return new BossService();
        }
        return null;
    }
}
