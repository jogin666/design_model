package com.zy.designmodel.behavior.visitor;

import com.zy.designmodel.behavior.visitor.visitors.Employee;
import com.zy.designmodel.behavior.visitor.visitors.EmployeeList;
import com.zy.designmodel.behavior.visitor.visitors.FullTimeEmployee;
import com.zy.designmodel.behavior.visitor.visitors.PartTimeEmployee;
import com.zy.designmodel.behavior.visitor.vistor.FinanceDepartment;

public class TestMain {

    public static void main(String args[]){
        EmployeeList empList = new EmployeeList();
        Employee fteA = new FullTimeEmployee("梁思成",  29);
        Employee fteB = new FullTimeEmployee("徐志摩", 30);
        Employee fteC = new FullTimeEmployee("梁徽因", 38);
        Employee fteD = new PartTimeEmployee("方鸿渐",  150);
        Employee fteE = new PartTimeEmployee("唐宛如",  170);

        empList.addEmployee(fteA);
        empList.addEmployee(fteB);
        empList.addEmployee(fteC);
        empList.addEmployee(fteD);
        empList.addEmployee(fteE);

        FinanceDepartment department=new FinanceDepartment();

        empList.accept(department);

    }

}
