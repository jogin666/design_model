package com.zy.designmodel.behavior.visitor.vistor;

import com.zy.designmodel.behavior.visitor.visitors.FullTimeEmployee;
import com.zy.designmodel.behavior.visitor.visitors.PartTimeEmployee;

public interface Department {

    void visit(FullTimeEmployee employee);

    void visit(PartTimeEmployee employee);
}
