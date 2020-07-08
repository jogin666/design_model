package com.zy.designmodel.structure.decoration.dao.imp;

import com.zy.designmodel.structure.decoration.dao.Pancake;

public class MeatPancake implements Pancake {

    private final String name="肉夹馍";

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
