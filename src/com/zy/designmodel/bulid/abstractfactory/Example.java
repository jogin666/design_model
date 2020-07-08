package com.zy.designmodel.bulid.abstractfactory;

public class Example {

    interface Brid{
        //fangfa
    }

    class Eagle implements Brid{
        //方法和属性
    }

    class Peacock implements Brid{
        //方法和属性
    }

    interface Factory{
        Brid getBrid();
    }

    class FactoryA implements Factory{
        @Override
        public Brid getBrid() {
            return new Eagle();
        }
    }

    class FactoryB implements Factory{
        @Override
        public Brid getBrid() {
            return new Peacock();
        }
    }
}
