package com.zy.designmodel.structure.component.file;

import com.zy.designmodel.structure.component.AbstractFile;

public class VideoFile extends AbstractFile {

    public String name;

    public VideoFile(String name){
        this.name=name;
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"文件进行杀毒！");
    }
}
