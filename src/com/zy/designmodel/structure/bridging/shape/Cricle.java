package com.zy.designmodel.structure.bridging.shape;

import com.zy.designmodel.structure.bridging.color.Color;

public class Cricle extends Shape {

    private final String name="圆形";

    public Cricle(Color color){
        super(color);
    }

    @Override
    public void draw() {
        color.draw(this);
    }

    @Override
    public String getShapName() {
        return name;
    }
}
