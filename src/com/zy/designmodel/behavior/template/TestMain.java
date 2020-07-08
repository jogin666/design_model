package com.zy.designmodel.behavior.template;

import com.zy.designmodel.behavior.template.core.CookTemplate;

public class TestMain {

    public static void main(String args[]){
        //炒猪肉
        CookTemplate cookPork=new CookingPork();
        cookPork.process();
        System.out.println("——————————————");
        //煮酸菜鱼
        CookTemplate cookFish=new CookingFish();
        cookFish.process();
    }
}
