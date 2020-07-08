package com.zy.designmodel.structure.bridging.shape;

import com.zy.designmodel.structure.bridging.color.Color;

public abstract class Shape {

    Color color;

    public Shape(Color color){
        this.color=color;
    }

    public abstract void draw();

    public abstract String getShapName();
}
