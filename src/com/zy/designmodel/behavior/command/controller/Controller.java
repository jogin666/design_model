package com.zy.designmodel.behavior.command.controller;

import com.zy.designmodel.behavior.command.commands.ChangeTVCommand;
import com.zy.designmodel.behavior.command.commands.CloseTVCommand;
import com.zy.designmodel.behavior.command.commands.OpenTVCommand;

public class Controller {

    private ChangeTVCommand changeTVCommand;
    private OpenTVCommand openTVCommand;
    private CloseTVCommand closeTVCommand;

    public int nowChannel=0;       //当前频道
    public int priorChannel;     //前一个频道，用于执行返回操作

    public Controller(ChangeTVCommand changeTVCommand, OpenTVCommand openTVCommand, CloseTVCommand closeTVCommand) {
        this.changeTVCommand = changeTVCommand;
        this.openTVCommand = openTVCommand;
        this.closeTVCommand = closeTVCommand;
    }

    //关闭电视
    public void close(){
       closeTVCommand.execute();
    }

    //打开电视
    public void open(){
        openTVCommand.execute();
    }

    //切换频道
    public void changeChannel(int channel){
        changeTVCommand.change(channel);
        priorChannel=nowChannel;
        nowChannel=channel;
    }

    //返回上一个频道
    public void channelUndo(){
        changeChannel(priorChannel);
    }
}
