package com.zy.designmodel.behavior.command.commands;

import com.zy.designmodel.behavior.command.Commands;
import com.zy.designmodel.behavior.command.TV;

public class CloseTVCommand extends Commands {

    private TV tv;

    public CloseTVCommand() {
        this.tv = new TV();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
