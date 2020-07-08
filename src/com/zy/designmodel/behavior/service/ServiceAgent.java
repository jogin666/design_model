package com.zy.designmodel.behavior.serviceAgency;

import com.zy.designmodel.behavior.serviceAgency.service.Service;
import com.zy.designmodel.behavior.serviceAgency.service.ServiceManagement;

public class ServiceAgent {
    private Service service;
    private ServiceManagement manager;

    public ServiceAgent() {
        manager=new ServiceManagement();
    }

    public void service(String type){
        service=manager.getBusnessService(type);
    }

    public void doTask(){
        service.doTask();
    }

    public static void main(String args[]){
        ServiceAgent agent=new ServiceAgent();
        agent.service("UserService");
        agent.doTask();
        agent.service("BossService");
        agent.doTask();
    }
}
