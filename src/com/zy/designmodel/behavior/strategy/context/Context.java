package com.zy.designmodel.behavior.strategy.context;

import com.zy.designmodel.behavior.strategy.strategys.Strategy;

public class Context {
    private String name;//支付的姓名
    private double money;//金额
    private Strategy strategy;//支付方式

    public Context(String name, double money, Strategy strategy) {
        this.name = name;
        this.money = money;
        this.strategy = strategy;
    }

    public void pay(){
        strategy.pay(this);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
