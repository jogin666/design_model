package com.zy.designmodel.bulid.builder.bulid;

import com.zy.designmodel.bulid.builder.Production.Production;
import com.zy.designmodel.bulid.builder.equipmentImp.FristEquipmentImp;

public class FristProductionBuliderImp implements ProductionBulider {

    private Production production;

    public FristProductionBuliderImp(){
        this.production=new Production();
    }

    @Override
    public void makeEquipment() {
        production.setEquipment(new FristEquipmentImp());
    }

    @Override
    public Production bulid() {
        return production;
    }
}
