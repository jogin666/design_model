package com.zy.designmodel.structure.adaptor.objectAdaptor;

import com.zy.designmodel.structure.adaptor.classAdaptor.Voltage110;
import com.zy.designmodel.structure.adaptor.classAdaptor.Voltage220;

public class VoltageAdaptor implements Voltage110 {

    private Voltage220 valtage;

    public VoltageAdaptor(Voltage220 valtage) {
        this.valtage = valtage;
    }

    @Override
    public void convert() {
        System.out.println("转为110V的电压");
    }

    public void connect(){
        valtage.connect();
    }

}
