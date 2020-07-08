package com.zy.designmodel.behavior.template;

import com.zy.designmodel.behavior.template.core.CookTemplate;

public class CookingFish extends CookTemplate {

    @Override
    protected void perparation() {
        System.out.println("买鱼和酸笋！");
    }

    @Override
    protected void cooking() {
        System.out.println("开始煮酸菜鱼");
    }

    @Override
    protected void showDishes() {
        System.out.println("上桌，开吃");
    }
}
