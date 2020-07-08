package com.zy.designmodel.structure.adaptor.classAdaptor;

public class Mobile {

    private VoltageAdaptor adaptor;

    public Mobile(VoltageAdaptor adaptor){
        this.adaptor=adaptor;
    }
    public void charge(){
       adaptor.connect();//连接220V的电压
       adaptor.convert();//转为110V的电压
       System.out.println("手机开始充电");
    }

    public static void main(String args[]){
       Mobile mobile=new Mobile(new VoltageAdaptor());
       mobile.charge();
    }
}
