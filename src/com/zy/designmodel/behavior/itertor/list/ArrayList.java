package com.zy.designmodel.behavior.itertor.list;

import com.zy.designmodel.behavior.itertor.core.Iterable;
import com.zy.designmodel.behavior.itertor.core.Iterator;

public class ArrayList implements List {
    private Object[] objects;
    private int index;
    private int size;

    public ArrayList() {
        objects=new Object[100];
        index=0;
        size=0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public void add(Object object) {
        objects[index++]=object;
        size++;
    }

    @Override
    public void remove(Object object) {
        //数组的移除贼烦
    }

    @Override
    public void remove(int index) {
        //数组的移除贼烦
    }

    @Override
    public Iterable iterator() {
        return new Iterator(this);
    }
}
