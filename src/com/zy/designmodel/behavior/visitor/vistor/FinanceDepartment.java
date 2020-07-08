package com.zy.designmodel.behavior.visitor.vistor;

import com.zy.designmodel.behavior.visitor.visitors.FullTimeEmployee;
import com.zy.designmodel.behavior.visitor.visitors.PartTimeEmployee;

public class FinanceDepartment implements Department {

    @Override
    public void visit(FullTimeEmployee employee) {
        String name = employee.getName();
        double time = employee.getTime();
        System.out.println("全职工"+name+"实际工资为:"+time*400+"元");
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        String name = employee.getName();
        double time = employee.getTime();
        System.out.println("临时工"+name+"实际工资为:"+time*17+"元");
    }
}
