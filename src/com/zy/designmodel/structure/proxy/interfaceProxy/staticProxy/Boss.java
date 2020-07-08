package com.zy.designmodel.structure.proxy.interfaceProxy.staticProxy;

import com.zy.designmodel.structure.proxy.interfaceProxy.Service;

public class Boss implements Service {
    
    @Override
    public void booking() {
        System.out.println("购票");    
    }

    @Override
    public void driving() {
        System.out.println("订车");
    }
}
