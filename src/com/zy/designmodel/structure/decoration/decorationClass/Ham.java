package com.zy.designmodel.structure.decoration.decorationClass;

import com.zy.designmodel.structure.decoration.dao.Pancake;

public class Ham extends Condiment {

    private final String name="火腿肠";

    private Pancake pancake;

    public Ham(Pancake pancake){
        this.pancake=pancake;
    }

    @Override
    public String getName() {
        return pancake.getName()+"，加"+name;
    }

    @Override
    public double getPrice() {
        return pancake.getPrice()+2.5;
    }
}
