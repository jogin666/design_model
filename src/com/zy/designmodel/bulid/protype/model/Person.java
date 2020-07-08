package com.zy.designmodel.bulid.protype.model;

public class Person implements Cloneable {
    private String name;
    private String gender;
    private int age;

    public Object clone(){
        Object object=null;
        try {
            object=super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
        return object;
    }

    @Override
    public String toString(){
        return "name->"+name+"__gender->"+gender+"__age->"+age;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
