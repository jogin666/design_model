package com.zy.designmodel.structure.bridging.shape;

import com.zy.designmodel.structure.bridging.color.Color;

public class Rectangle extends Shape{

    public final String name="矩形";

    public Rectangle(Color color){
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
