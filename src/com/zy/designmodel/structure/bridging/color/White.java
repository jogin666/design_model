package com.zy.designmodel.structure.bridging.color;

import com.zy.designmodel.structure.bridging.shape.Shape;

public class White implements Color {

    @Override
    public void draw(Shape shape) {
        String name=shape.getShapName();
        System.out.println("画一个白色的"+name);
    }
}
