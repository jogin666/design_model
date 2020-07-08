package com.zy.designmodel.behavior.template;

import com.zy.designmodel.behavior.template.core.CookTemplate;

public class CookingPork extends CookTemplate {

    @Override
    protected void perparation() {
        System.out.println("买猪肉和相应的配菜！");
    }

    @Override
    protected void cooking() {
        System.out.println("开始炒猪肉");
    }

    @Override
    protected void showDishes() {
        System.out.println("上桌");
    }
}
