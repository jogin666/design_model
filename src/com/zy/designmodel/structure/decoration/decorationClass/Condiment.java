package com.zy.designmodel.structure.decoration.decorationClass;

import com.zy.designmodel.structure.decoration.dao.Pancake;

public abstract class Condiment implements Pancake {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
