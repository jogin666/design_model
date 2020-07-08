package com.zy.designmodel.structure.adaptor.objectAdaptor;

import com.zy.designmodel.structure.adaptor.classAdaptor.Voltage220;

public class Mobile {

    private VoltageAdaptor adaptor;

    public Mobile(VoltageAdaptor adaptor){
        this.adaptor=adaptor;
    }

    //充电
    public void charge(){
        adaptor.connect();//连接220V的电压
        adaptor.convert();//转为110V的电压
        System.out.println("手机开始充电");
    }

    public static void main(String args[]){
        VoltageAdaptor adaptor=new VoltageAdaptor(new Voltage220());
        Mobile mobile=new Mobile(adaptor);
        mobile.charge();
    }
}
