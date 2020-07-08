package com.zy.designmodel.structure.adaptor.interfaceAdaptor;

public class Adaptor extends VoltageAdaptor {
    @Override
    public void convert110V() {
        System.out.println("转换为110V的电压");
    }
}
