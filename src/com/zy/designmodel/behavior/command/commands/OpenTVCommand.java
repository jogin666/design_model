package com.zy.designmodel.behavior.command.commands;

import com.zy.designmodel.behavior.command.Commands;
import com.zy.designmodel.behavior.command.TV;

public class OpenTVCommand extends Commands {

    private TV tv;
    public OpenTVCommand(){
        tv=new TV();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
