package com.zy.designmodel.behavior.visitor.visitors;

import com.zy.designmodel.behavior.visitor.vistor.Department;

public class FullTimeEmployee extends Employee {

    private String name;
    private double time;

    @Override
    protected void accept(Department visitor) {
        visitor.visit(this);
    }

    public FullTimeEmployee(String name, double time) {
        this.name=name;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
