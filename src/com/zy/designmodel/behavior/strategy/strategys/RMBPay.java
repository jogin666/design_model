package com.zy.designmodel.behavior.strategy.strategys;

import com.zy.designmodel.behavior.strategy.context.Context;

public class RMBPay implements Strategy{

    @Override
    public void pay(Context context) {
        System.out.println("现在给："+context.getName()+" 人民币支付 "+context.getMoney()+"元！");
    }
}
