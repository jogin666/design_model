package com.zy.designmodel.behavior.duty;

import com.zy.designmodel.behavior.duty.handler.ProductManager;
import com.zy.designmodel.behavior.duty.handler.ProjectManager;
import com.zy.designmodel.behavior.duty.model.FeeModel;
import com.zy.designmodel.behavior.duty.model.Model;

public class MainTest {

    public static void main(String args[]) {
        ProjectManager projectManager = new ProjectManager();
        ProductManager productManager=new ProductManager();
        projectManager.setSuccessor(productManager);

        Model model=new FeeModel("小李",300.0);
        projectManager.handle(model);

        Model mol=new FeeModel("小明",600.0);
        productManager.handle(mol);

        ((FeeModel) model).setFee(800.0);
        productManager.handle(model);
    }
}
