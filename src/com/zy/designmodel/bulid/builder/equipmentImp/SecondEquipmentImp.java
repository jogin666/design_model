package com.zy.designmodel.bulid.builder.equipmentImp;

public class SecondEquipmentImp implements Equipment {
    @Override
    public String showViceWeapon() {
        return "+辅修->屠龙刀";
    }

    @Override
    public String showMainWeapon() {
        return "+主修->倚天剑";
    }

    @Override
    public String showEnergy() {
        return "能量->红牛";
    }
}
