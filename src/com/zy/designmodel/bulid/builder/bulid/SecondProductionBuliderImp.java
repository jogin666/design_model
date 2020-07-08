package com.zy.designmodel.bulid.builder.bulid;

import com.zy.designmodel.bulid.builder.Production.Production;
import com.zy.designmodel.bulid.builder.equipmentImp.SecondEquipmentImp;

public class SecondProductionBuliderImp implements ProductionBulider {

    private Production production=null;

    public SecondProductionBuliderImp(){
        production=new Production();
    }

    @Override
    public void makeEquipment() {
        production.setEquipment(new SecondEquipmentImp());
    }

    @Override
    public Production bulid() {
        return production;
    }
}
