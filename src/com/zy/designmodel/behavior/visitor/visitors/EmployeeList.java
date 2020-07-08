package com.zy.designmodel.behavior.visitor.visitors;

import com.zy.designmodel.behavior.visitor.vistor.Department;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<Employee> empList = new ArrayList<Employee>();

    public void addEmployee(Employee emp) {
        this.empList.add(emp);
    }

    public void accept(Department visitor) {
        for(Employee emp:empList) {
            emp.accept(visitor);
        }
    }
}
