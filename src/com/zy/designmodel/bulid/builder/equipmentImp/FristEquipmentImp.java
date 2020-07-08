package com.zy.designmodel.bulid.builder.equipmentImp;

public class FristEquipmentImp implements Equipment {
    @Override
    public String showEnergy() {
        return "能量->脉动";
    }

    @Override
    public String showMainWeapon() {
        return "+主修->九阴白骨爪";
    }

    @Override
    public String showViceWeapon() {
        return "+辅修->降龙十八掌";
    }
}
