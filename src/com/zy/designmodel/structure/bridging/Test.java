package com.zy.designmodel.structure.bridging;

import com.zy.designmodel.structure.bridging.color.Color;
import com.zy.designmodel.structure.bridging.color.Gray;
import com.zy.designmodel.structure.bridging.color.White;
import com.zy.designmodel.structure.bridging.shape.Cricle;

public class Test {

    public static void main(String args[]){
        Color white=new White();
        Cricle cricle=new Cricle(white);
        cricle.draw();
        Color gray=new Gray();
        cricle=new Cricle(gray);
        cricle.draw();
    }
}
