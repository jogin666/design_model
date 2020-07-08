package com.zy.designmodel.behavior.experssion.core;

import com.zy.designmodel.behavior.experssion.Expression;

public class TerminalExpression implements Expression {

    private String date;

    public TerminalExpression(String date) {
        this.date = date;
    }

    @Override
    public boolean experss(String context) {
        if (context.contains(date)){
            return true;
        }
        return false;
    }
}
