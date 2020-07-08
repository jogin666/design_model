package com.zy.designmodel.bulid.builder.director;

import com.zy.designmodel.bulid.builder.Production.Production;
import com.zy.designmodel.bulid.builder.bulid.ProductionBulider;

public class Director {
    private ProductionBulider bulider;

    public Director(ProductionBulider bulider){
        this.bulider=bulider;
    }

    public Production createrProduction(){
        bulider.makeEquipment();
        return bulider.bulid();
    }
}
