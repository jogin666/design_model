package com.zy.designmodel.bulid.builder.Production;

import com.zy.designmodel.bulid.builder.equipmentImp.Equipment;

public class Production {
    private Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString(){
        return equipment.showEnergy()+equipment.showMainWeapon()+equipment.showViceWeapon();
    }
}
