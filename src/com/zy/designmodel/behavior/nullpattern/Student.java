package com.zy.designmodel.behavior.nullpattern;

import com.zy.designmodel.behavior.nullpattern.core.Students;

public class Student implements Students {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getStuInfo() {
        return toString();
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
