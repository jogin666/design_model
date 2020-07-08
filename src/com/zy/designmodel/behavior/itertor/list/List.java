package com.zy.designmodel.behavior.itertor.list;

import com.zy.designmodel.behavior.itertor.core.Iterable;

public interface List {
    int getSize();
    Object get(int index);
    void add(Object object);
    void remove(Object object);
    void remove(int index);
    Iterable iterator();
}
