package com.zy.designmodel.behavior.serviceAgency.service;

public class BossService implements Service {

    @Override
    public void doTask() {
        System.out.println("执行老板要求的业务");
    }
}
