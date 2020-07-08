package com.zy.designmodel.behavior.command;

public interface Command {
    void change(int channel); //切换频道
    void execute(); //开关电视
}
