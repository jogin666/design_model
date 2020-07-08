package com.zy.designmodel.structure.proxy.interfaceProxy.staticProxy;

import com.zy.designmodel.structure.proxy.interfaceProxy.Service;

public class Secretary implements Service {

    private Boss boss;

    public Secretary(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void booking() {
        boss.booking();
    }

    @Override
    public void driving() {
        boss.driving();
    }

    public static void main(String args[]){
        Service service=new Secretary(new Boss());
        System.out.println("老板交代秘书订票");
        service.booking();
        System.out.println("老板交代秘书预约车");
        service.driving();
    }
}
