package com.zy.designmodel.behavior.strategy.context;

import com.zy.designmodel.behavior.strategy.strategys.Strategy;

public class PayContextWithAccount extends Context {
    private String account;

    public PayContextWithAccount(String name, double money, Strategy strategy,String account) {
        super(name, money, strategy);
        this.account=account;
    }

    public String getAccount() {
        return account;
    }
}
