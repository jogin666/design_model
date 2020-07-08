package com.zy.designmodel.bulid.protype.deepAndshallow;

public class Person {
    private String name;
    private String gender;
    private String age;

    public Person(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //拷贝构造函数
    //浅拷贝  使用一个已知的对象对新建的实例对象的非引用成员逐个进行赋值
    public Person(Person person){
        this.name=person.name;
        this.gender=person.gender;
        this.age=person.age;
    }

//    @Override
//    public String toString() {
//        return "name->"+name+"__gender->"+gender+"__age->"+age;
//    }
}
