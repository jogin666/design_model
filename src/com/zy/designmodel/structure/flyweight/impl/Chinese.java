package com.zy.designmodel.structure.flyweight.impl;

import com.zy.designmodel.structure.flyweight.People;

public class Chinese implements People {
    private String name;
    private String language;
    
    public Chinese(String name){
        this.name=name;
    }

    @Override
    public void speak() {
        System.out.println(name+"说的是"+language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
