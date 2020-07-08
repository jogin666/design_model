package com.zy.designmodel.behavior.strategy;

import com.zy.designmodel.behavior.strategy.context.Context;
import com.zy.designmodel.behavior.strategy.context.PayContextWithAccount;
import com.zy.designmodel.behavior.strategy.strategys.AccountPay;
import com.zy.designmodel.behavior.strategy.strategys.DollarPay;
import com.zy.designmodel.behavior.strategy.strategys.RMBPay;
import com.zy.designmodel.behavior.strategy.strategys.Strategy;

public class Test {
    public static void main(String args[]){
        //人民币支付策略
        Strategy rmbStrategy = new RMBPay();
        //准备小王的支付上下文，向小王支付工资
        Context ctx = new Context("小王",30000,rmbStrategy);
        ctx.pay();
        //美金
        Strategy dollarStrategy = new DollarPay();
        //准备Jack的支付上下文，向Jack支付工资
        ctx = new Context("jack",10000,dollarStrategy);
        ctx.pay();
        //创建支付到银行账户的支付策略
        Strategy accountStrategy = new AccountPay();
        //准备带有银行账户的上下文，向小张的账户支付
        ctx = new PayContextWithAccount("小张",40000,accountStrategy,"1234567890");
        ctx.pay();
    }
}
