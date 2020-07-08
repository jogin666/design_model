package com.zy.designmodel.structure.component.file;

import com.zy.designmodel.structure.component.AbstractFile;

public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"文件进行杀毒！");
    }
}
