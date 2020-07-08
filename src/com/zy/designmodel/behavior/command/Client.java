package com.zy.designmodel.behavior.command;

import com.zy.designmodel.behavior.command.commands.ChangeTVCommand;
import com.zy.designmodel.behavior.command.commands.CloseTVCommand;
import com.zy.designmodel.behavior.command.controller.Controller;
import com.zy.designmodel.behavior.command.commands.OpenTVCommand;

public class Client {
    public static void main(String args[]){
        Controller controller=new Controller(new ChangeTVCommand(),new OpenTVCommand(),new CloseTVCommand());
        controller.open();
        controller.changeChannel(10);
        controller.changeChannel(15);
        controller.channelUndo();
        controller.close();
    }
}
