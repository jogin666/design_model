package com.zy.designmodel.structure.component.folder;

import com.zy.designmodel.structure.component.File;
import com.zy.designmodel.structure.component.file.ImageFile;
import com.zy.designmodel.structure.component.file.TXTFile;
import com.zy.designmodel.structure.component.file.VideoFile;

import java.util.ArrayList;

public class Folder implements File {

    private String name;
    //存储文件
    private ArrayList<File> fileList=new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public File getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void remove(File file) {
        fileList.remove(file);
    }

    @Override
    public void add(File file) {
        fileList.add(file);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        //如果file文件夹，则会递归
        for(File file:fileList){
            file.killVirus();
        }
    }
    
    public static void main(String args[]){
        //针对抽象构件编程
        File file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;
        //文件夹
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");
        //文件
        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TXTFile("九阴真经.txt");
        file4 = new TXTFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");
        //添加文件
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        //根目录
        folder1 = new Folder("Sunny的资料");
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //从“Sunny的资料”节点开始进行杀毒操作
        folder1.killVirus();
    }
}
