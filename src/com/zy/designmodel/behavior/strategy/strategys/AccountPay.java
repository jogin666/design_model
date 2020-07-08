package com.zy.designmodel.behavior.strategy.strategys;

import com.zy.designmodel.behavior.strategy.context.Context;
import com.zy.designmodel.behavior.strategy.context.PayContextWithAccount;

public class AccountPay implements Strategy{

    @Override
    public void pay(Context context) {
        PayContextWithAccount ctx= (PayContextWithAccount) context;
        System.out.println("现在给："+ctx.getName()+"的账户："+ctx.getAccount()+" 支付工资："+ctx.getMoney()+" 元！");
    }
}
