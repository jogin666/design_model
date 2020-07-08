package com.zy.designmodel.behavior.nullpattern.core;

public class NullStudent implements Students{

    @Override
    public String getStuInfo() {
        return "this is null object";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
