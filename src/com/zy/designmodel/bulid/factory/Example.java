package com.zy.designmodel.bulid.factory;

public class Example {
    interface Brid{
        //方法
    }

    class Eagle implements Brid{
        //属性，方法
    }

    class Peacock implements Brid{
        //属性，方法
    }

    //根据寻求返回所需的对象
   class BridFactory{
        public  Brid getBrid(String name){ //应为静态的方法  static  此处内部类不能存在静态的方法
            if ("Eagle".equals(name)){
                return new Eagle();
            }else if ("Peacock".equals(name)){
                return new Peacock();
            }else{
                throw new RuntimeException("不存在该种类");
            }
        }
    }
}
