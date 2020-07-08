package com.zy.designmodel.structure.flyweight;

import com.zy.designmodel.structure.flyweight.impl.Chinese;

import java.util.HashMap;
import java.util.Map;

public class ChineseFactory {
    //存储
    public static Map<String,People> chinese=new HashMap<String,People>();

    public static Chinese getInstance(String name){
        Chinese people= (Chinese) chinese.get(name);
        if (people==null){
            people=new Chinese(name);
            chinese.put(name,people);
        }
        return people;
    }

    public static int size(){
        return chinese.size();
    }

    public static void main(String args[]){
        String name="小明";
        Chinese p=ChineseFactory.getInstance(name);
        p.setLanguage("方言");
        for(int i=0;i<3;i++){
            Chinese peop=ChineseFactory.getInstance(name);
            p.speak();
            System.out.println("p->"+peop);
        }
    }
}
