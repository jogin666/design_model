package com.zy.designmodel.structure.proxy.interfaceProxy.dynamicModel;

import java.util.ArrayList;
import com.zy.designmodel.structure.proxy.interfaceProxy.Service;
import com.zy.designmodel.structure.proxy.interfaceProxy.staticProxy.Boss;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Comparator;

public class DynamicProxyHander implements InvocationHandler {

    private Object target;

    public DynamicProxyHander(Object target){
        this.target=target;
    }

    // 获取代理对象
    public Object creteTargetProxy(){
        /**
         * 第一个参数：指定代理目标对象的类加载器
         * 第二个参数：制定代理目标对象的接口
         * 第三个参数：执定的处理器
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("老板交代预定票：");
        Object result=method.invoke(target,args);
        return result;
    }

    //动态代理
    public static void main(String args[]){
        //被代理对象
        Boss boss=new Boss();
        //生成代理对象
        Service proxy=(Service)new DynamicProxyHander(boss).creteTargetProxy();
        //执行方法
        proxy.booking();
        System.out.println(proxy.toString());
        System.out.println(boss.toString());
        System.out.println(proxy==boss);
    }
}
