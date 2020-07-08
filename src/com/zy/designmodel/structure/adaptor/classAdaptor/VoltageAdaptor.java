package com.zy.designmodel.structure.adaptor.classAdaptor;

public class VoltageAdaptor extends Voltage220 implements Voltage110{

    @Override
    public void convert() {
        System.out.println("转为110V的电压");
    }

}
