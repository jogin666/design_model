package com.zy.designmodel.structure.proxy.proxy;

import com.zy.designmodel.structure.proxy.interfaceProxy.staticProxy.Boss;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;


public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(final Object target) {
         //维护目标对象
         this.target = target;
         //创建工具类
         Enhancer enhancer = new Enhancer();
         //将目标对象设置为工具类的父类
         enhancer.setSuperclass(this.target.getClass());
         //设置回调函数(处理器——方法拦截器）
         enhancer.setCallback(this);
         //创建代理对象
         return enhancer.create();
    }


    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备");
        Object result = methodProxy.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }

    public static void main(String args[]){
        Boss boss=new Boss();
        CglibProxy proxy=new CglibProxy();
        Boss bossProxy=(Boss) proxy.getInstance(boss);
        bossProxy.booking();
    }
}
