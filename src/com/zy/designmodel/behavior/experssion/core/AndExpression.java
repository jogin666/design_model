package com.zy.designmodel.behavior.experssion.core;

import com.zy.designmodel.behavior.experssion.Expression;

public class AndExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean experss(String context) {
        return exp1.experss(context) && exp2.experss(context);
    }
}
