package com.zy.designmodel.structure.decoration.dao.imp;

import com.zy.designmodel.structure.decoration.dao.Pancake;

public class TornCake implements Pancake {
    private final String name="手抓饼";

    @Override
    public double getPrice() {
        return 4.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
