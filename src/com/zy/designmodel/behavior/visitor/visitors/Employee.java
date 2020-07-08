package com.zy.designmodel.behavior.visitor.visitors;

import com.zy.designmodel.behavior.visitor.vistor.Department;

public abstract class Employee {

    protected abstract void accept(Department visitor);

}
