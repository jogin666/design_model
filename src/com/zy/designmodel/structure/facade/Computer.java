package com.zy.designmodel.structure.facade;

import com.zy.designmodel.structure.facade.core.CPU;
import com.zy.designmodel.structure.facade.core.Disk;
import com.zy.designmodel.structure.facade.core.Memory;
import com.zy.designmodel.structure.facade.core.Operation;

public class Computer {

    private Operation cpu;
    private Operation disk;
    private Operation memory;

    public Computer(){
        cpu=new CPU();
        disk=new Disk();
        memory=new Memory();
    }

    public void startUp(){
        System.out.println("开启电脑");
        cpu.startUp();
        disk.startUp();
        memory.startUp();
    }

    public void showDown(){
        System.out.println("关闭电脑");
        cpu.showDown();
        disk.startUp();
        memory.showDown();
    }
    
    public static void main(String args[]){
        Computer computer=new Computer();
        computer.startUp();
        System.out.println("——————————————");
        computer.showDown();
    }
}
