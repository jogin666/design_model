package com.zy.designmodel.behavior.itertor.core;

import com.zy.designmodel.behavior.itertor.list.List;

public class Iterator implements Iterable {
    private List list;
    private int index;

    public Iterator(List list) {
        this.list = list;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if (index<list.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}
