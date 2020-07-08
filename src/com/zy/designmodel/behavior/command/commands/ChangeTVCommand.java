package com.zy.designmodel.behavior.command.commands;

import com.zy.designmodel.behavior.command.Commands;
import com.zy.designmodel.behavior.command.TV;

public class ChangeTVCommand extends Commands {

    private TV tv;

    public ChangeTVCommand() {
        tv=new TV();
    }

    @Override
    public void change(int channel) {
       tv.changeChannel(channel);
    }
}
