package com.zy.designmodel.behavior.duty.handler;

import com.zy.designmodel.behavior.duty.model.FeeModel;
import com.zy.designmodel.behavior.duty.model.Model;

public class ProductManager extends Handler {

    @Override
    public void handle(Model model) {
        if (FeeModel.type.equals(model.getType())){
            handleFeeQuest(model);
        }else{
            super.handle(model); //返回给父类处理
        }
    }

    private void handleFeeQuest(Model model){
        FeeModel feeModel= (FeeModel) model;
        if (feeModel.getFee()<1000){
            if (feeModel.getUsername().equals("小李")) {
                System.out.println("产品经理批准了" + feeModel.getUsername() + "的经费" + feeModel.getFee() + "的请求！");
            }else{
                System.out.println("产品经理不批准" + feeModel.getUsername() + "的经费" + feeModel.getFee() + "的请求！");
            }
        }else{
            if (successor!=null){
                successor.handle(model);
            }
        }
    }
}
