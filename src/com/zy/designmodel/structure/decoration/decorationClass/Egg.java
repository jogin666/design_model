package com.zy.designmodel.structure.decoration.decorationClass;

import com.zy.designmodel.structure.decoration.dao.Pancake;

public class Egg extends Condiment {

    private Pancake pancake;

    public Egg(Pancake pancake){
        this.pancake=pancake;
    }

    private final String name="煎蛋";

    @Override
    public String getName() {
        return pancake.getName()+"，加"+name;
    }

    @Override
    public double getPrice() {
        return pancake.getPrice()+2.0;
    }
}
