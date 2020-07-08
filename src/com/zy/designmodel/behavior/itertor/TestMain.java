package com.zy.designmodel.behavior.itertor;

import com.zy.designmodel.behavior.itertor.core.Iterable;
import com.zy.designmodel.behavior.itertor.list.ArrayList;
import com.zy.designmodel.behavior.itertor.list.List;

public class TestMain {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.getSize());
        Iterable iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
