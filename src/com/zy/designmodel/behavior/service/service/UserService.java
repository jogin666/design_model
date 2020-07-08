package com.zy.designmodel.behavior.serviceAgency.service;

public class UserService implements Service {

    @Override
    public void doTask() {
        System.out.println("执行用户要办理的业务！");
    }
}
