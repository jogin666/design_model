package com.zy.designmodel.bulid.protype.model;

public class Test {

    public static void main(String args[]){
        Person p=new Person("zhangsan","male",22);
        Person person= (Person) p.clone();
        System.out.println(p);
        System.out.println(person);
        System.out.println("person==p?->"+(person==p));
        System.out.println("p.getClass()==person.getClass()->"+(p.getClass()==person.getClass()));
    }
}
