package com.zy.designmodel.bulid.protype.deepAndshallow;

public class Test {
    public static void main(String args[]){
        Person person=new Person("zhangsan","male","12");
        Person p=new Person(person);
        System.out.println(person);
        System.out.println(p);
    }
}
