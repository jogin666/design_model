package com.zy.designmodel.structure.component;

public interface File {

    void add(File file);

    void remove(File file);

    void killVirus();

    File getChild(int i);
}
