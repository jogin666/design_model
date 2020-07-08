package com.zy.designmodel.behavior.template.core;

public abstract class CookTemplate {

    protected abstract void perparation();

    protected abstract void cooking();

    protected abstract void showDishes();

    public final void process(){
        perparation();
        cooking();
        showDishes();
    }
}
